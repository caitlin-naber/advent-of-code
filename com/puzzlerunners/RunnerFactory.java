package com.puzzlerunners;

public class RunnerFactory {

    public Runnable createRunner(String dateCode) {
        switch (dateCode) {
            case "2015_1":
                return new Runner201501();
            case "2015_2":
                return new Runner201502();
            default:
                System.out.println("This puzzle has not yet been solved!");
                return null;
        }
    }
}
