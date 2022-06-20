package com.puzzlerunners;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.List;
import java.util.Scanner;

public class Runner201502 implements Runnable {

    private String inputData = "";

    @Override
    public void loadData() throws FileNotFoundException {
        File inputFile = new File("Input201502.txt");
        Scanner fileScanner = new Scanner(inputFile);
//        while (fileScanner.hasNextLine()) {
//            String lineString = fileScanner.nextLine();
//            int[] fileDimensions = new int[3];
//            int dimensions = Integer.parseInt(lineString.split("x"));

//        }
    }

    @Override
    public String solvePartOne() {
        return null;
    }

    @Override
    public String solvePartTwo() {
        return null;
    }
}
