package tests;

import com.puzzlerunners.Runner201503;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Runner;

import java.util.ArrayList;
import java.util.List;

public class Runner201503Tests {

    Runner201503 runner;
    List<String> testInstructions;

    @Before
    public void setup() {
        runner = new Runner201503();
        testInstructions = new ArrayList<>();
    }

    @Test
    public void test_single_right() {
        int expectedResult = 2;
        testInstructions.add(">");
        int actualResult = runner.deliverPresents(testInstructions);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_square() {
        int expectedResult = 4;
        testInstructions.add("^");
        testInstructions.add(">");
        testInstructions.add("v");
        testInstructions.add("<");
        int actualResult = runner.deliverPresents(testInstructions);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_lucky_kids_at_2_houses() {
        int expectedResult = 2;
        for (int i = 0; i < 5; i++) {
            testInstructions.add("^");
            testInstructions.add("v");
        }
        int actualResult = runner.deliverPresents(testInstructions);
        Assert.assertEquals(expectedResult, actualResult);
    }
}
