package com.puzzlerunners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Runner201503 implements Runnable {

    List<String> instructions;

    @Override
    public void loadData() throws FileNotFoundException {
        File inputFile = new File("data/Input201503.txt");
        Scanner inputScanner = new Scanner(inputFile);
        String line = inputScanner.nextLine();
        instructions = List.of(line.split(""));
    }

    @Override
    public String solvePartOne() {
        return null;
    }

    @Override
    public String solvePartTwo() {
        return null;
    }

    public int deliverPresents(List<String> instructions) {
        Set<List<Integer>> deliveryLocations = new HashSet<>();
        List<Integer> currentLocation = new ArrayList<>();
        currentLocation.add(0);
        currentLocation.add(0);
        deliveryLocations.add(currentLocation);
        for (String instruction : instructions) {

        }
        return 0;
    }


}
