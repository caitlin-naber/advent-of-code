package com.puzzlerunners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runner201502 implements Runnable {

    private List<List> allDimensions = new ArrayList<List>();

    @Override
    public void loadData() throws FileNotFoundException {
        File inputFile = new File("data/Input201502.txt");
        Scanner fileScanner = new Scanner(inputFile);
        while (fileScanner.hasNextLine()) {
            List<Integer> singleDimensions = new ArrayList<Integer>();
            String line = fileScanner.nextLine();
            String[] dimensions = line.split("x");
            for (String dimension : dimensions) {
                Integer intDimension = Integer.parseInt(dimension);
                singleDimensions.add(intDimension);
            }
            allDimensions.add(singleDimensions);
        }
    }

    @Override
    public String solvePartOne() {
        int surfaceArea = 0;
        for (List<Integer> dimension : allDimensions) {
            int length = dimension.get(0);
            int width = dimension.get(1);
            int height = dimension.get(2);
            int sideOne = length * width;
            int sideTwo = width * height;
            int sideThree = height * length;
            int smallestSide = sideOne;
            List<Integer> sides = new ArrayList<>();
            sides.add(sideTwo);
            sides.add(sideThree);
            for (int side : sides) {
                if (side < smallestSide) {
                    smallestSide = side;
                }
            }
            surfaceArea += (2 * sideOne) + (2 * sideTwo) + (2 * sideThree) + smallestSide;
        }
        return String.valueOf(surfaceArea);
    }

    @Override
    public String solvePartTwo() {
        int ribbonLength = 0;
        for (List<Integer> dimension : allDimensions) {
            Collections.sort(dimension);
            int length = dimension.get(0);
            int width = dimension.get(1);
            int height = dimension.get(2);
            int volume = length * width * height;
            ribbonLength += volume + (2 * length) + (2 * width);
        }
        return String.valueOf(ribbonLength);
    }
}