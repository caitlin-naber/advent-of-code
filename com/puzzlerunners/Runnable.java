package com.puzzlerunners;

import java.io.FileNotFoundException;

public interface Runnable {

    public void loadData() throws FileNotFoundException;

    public String solvePartOne();

    public String solvePartTwo();

}
