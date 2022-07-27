package tests;

import com.puzzlerunners.Runner201504;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Runner201504Tests {

    Runner201504 runner;

    @Before
    public void setup() {
        runner = new Runner201504();
    }

    @Test
    public void test_one() {
        String input = "abcdef";
        String actualResult = runner.solverImplementation(input, "00000");
        String expectedResult = "609043";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_two() {
        String input = "pqrstuv";
        String actualResult = runner.solverImplementation(input, "00000");
        String expectedResult = "1048970";
        Assert.assertEquals(expectedResult, actualResult);
    }
}
