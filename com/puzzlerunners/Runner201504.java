package com.puzzlerunners;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Runner201504 implements Runnable{

    String secretKey = "";

    @Override
    public void loadData() throws FileNotFoundException {
        File inputFile = new File("data/Input201504.txt");
        Scanner inputScanner = new Scanner(inputFile);
        secretKey = inputScanner.nextLine();
    }

    @Override
    public String solvePartOne() {
        return solverImplementation(secretKey, "00000");
    }

    @Override
    public String solvePartTwo() {
        return solverImplementation(secretKey, "000000");
    }

    public String solverImplementation(String secretKey, String prefix) {
        int trial = 1;
        int prefixCount = prefix.length();

        while (true) {
            String testString = secretKey + trial;
            byte[] testBytes = testString.getBytes(StandardCharsets.UTF_8);
            try {
                MessageDigest mesDig = MessageDigest.getInstance("MD5");
                byte[] byteHash = mesDig.digest(testBytes);
                String hexHash = "";
                for (byte i : byteHash) {
                    hexHash += String.format("%02X", i);
                }
                if (hexHash.substring(0, prefixCount).equals(prefix)) {
                    break;
                }
            } catch (NoSuchAlgorithmException e) {
                System.out.println("Algorithm not supported");
                break;
            }
            trial++;
        }
        return String.valueOf(trial);
    }
}
