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
        Set<List<Integer>> locations = new HashSet<>();
        locations = deliverPresents(instructions);
        int presentsDelivered = locations.size();
        return String.valueOf(presentsDelivered);
    }

    @Override
    public String solvePartTwo() {
        List<String> santaInstructions = selectInstructions(instructions, 0, 2);
        List<String> roboSantaInstructions = selectInstructions(instructions, 1, 2);
        Set<List<Integer>> santaLocations = new HashSet<>();
        Set<List<Integer>> roboSantaLocations = new HashSet<>();
        santaLocations = deliverPresents(santaInstructions);
        roboSantaLocations = deliverPresents(roboSantaInstructions);
        santaLocations.addAll(roboSantaLocations);
        int presentsDelivered = santaLocations.size();
        return String.valueOf(presentsDelivered);
    }

    public Set<List<Integer>> deliverPresents(List<String> instructions) {
        Set<List<Integer>> deliveryLocations = new HashSet<>();
        int currentX = 0;
        int currentY = 0;
        List<Integer> currentLocation = new ArrayList<>();
        currentLocation.add(currentX);
        currentLocation.add(currentY);
        deliveryLocations.add(currentLocation);

        for (String instruction : instructions) {
            if (instruction.equals(">")) {
                currentX++;
            } else if (instruction.equals("<")) {
                currentX--;
            } else if (instruction.equals("v")) {
                currentY--;
            } else if (instruction.equals("^")) {
                currentY++;
            } else {
                System.out.println("I'm lost!");
            }
            deliveryLocations = updateLocation(currentX, currentY, deliveryLocations);
        }
        return deliveryLocations;
    }

    public Set<List<Integer>> updateLocation(int x, int y, Set<List<Integer>> locations) {
        List<Integer> currentLocation = new ArrayList<>();
        currentLocation.add(x);
        currentLocation.add(y);
        locations.add(currentLocation);

        return locations;
    }

    public List<String> selectInstructions(List<String> instructions, int start, int step) {
        List<String> selectedInstructions = new ArrayList<>();
        for (int i = start; i < instructions.size(); i = i + step) {
            selectedInstructions.add(instructions.get(i));
        }
        return selectedInstructions;
    }


}
