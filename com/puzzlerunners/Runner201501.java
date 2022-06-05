package com.puzzlerunners;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Runner201501 implements Runnable{

    String inputData = "";

    @Override
    public void loadData() throws FileNotFoundException {
        File inputFile = new File("data/Input201501.txt");
        Scanner inputScanner = new Scanner(inputFile);
        inputData = inputScanner.nextLine();
    }

    @Override
    public String solvePartOne() {
        String[] data = inputData.split("");
        int floor = 0;
        for (String item : data) {
            if (item.equals("(")) {
                floor++;
            } else {
                floor--;
            }
        }
        return String.valueOf(floor);
    }

    @Override
    public String solvePartTwo() {
        String[] data = inputData.split("");
        int floor = 0;
        int instruction = 1;
        for (String item : data) {
            if (item.equals("(")) {
                floor++;
            } else {
                floor--;
            }
            if (floor == -1) {
                return String.valueOf(instruction);
            }
            instruction++;
        }
        return "We never reached the basement!";
    }
}
