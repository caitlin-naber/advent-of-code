package com.puzzlerunners;

public class RunnerFactory {

    public Runnable createRunner(String dateCode) {
        switch (dateCode) {
            case "2015_1":
                Runner201501 runner = new Runner201501();
                return runner;
            default:
                System.out.println("This puzzle has not yet been solved!");
                return null;
        }
    }
}
