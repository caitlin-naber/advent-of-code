import java.io.FileNotFoundException;
import java.util.Scanner;
import com.puzzlerunners.RunnerFactory;
import com.puzzlerunners.Runnable;

public class PuzzleApp {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the year of the puzzle you would like to see the solution for: (ex: 2015, 2021)");
        String inputYear = userInput.nextLine();
        int puzzleYear = Integer.parseInt(inputYear);

        System.out.println("Enter the day of the puzzle you would like to see the solution for: (ex: 1, 25)");
        String inputDay = userInput.nextLine();
        int puzzleDay = Integer.parseInt(inputDay);

        String dateCode = puzzleYear + "_" + puzzleDay;

        RunnerFactory runnerFactory = new RunnerFactory();
        Runnable runner = runnerFactory.createRunner(dateCode);

        runner.loadData();
        String partOneSolution = runner.solvePartOne();
        String partTwoSolution = runner.solvePartTwo();

        System.out.println("The solution to part one is: " + partOneSolution);
        System.out.println("The solution to part two is: " + partTwoSolution);
    }
}
