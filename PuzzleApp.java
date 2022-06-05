import java.util.Scanner;
import com.puzzlerunners.Runner201501;

public class PuzzleApp {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the year of the puzzle you would like to see the solution for: (ex: 2015, 2021)");
        String inputYear = userInput.nextLine();
        int puzzleYear = Integer.parseInt(inputYear);

        System.out.println("Enter the day of the puzzle you would like to see the solution for: (ex: 1, 25)");
        String inputDay = userInput.nextLine();
        int puzzleDay = Integer.parseInt(inputDay);

        String dateCode = puzzleYear + "_" + puzzleDay;

        switch (dateCode) {
            case "2015_1":
                Runner201501 runner = new Runner201501();
                System.out.println(runner.test());
                break;
            default:
                System.out.println("This puzzle has not yet been solved!");
                break;
        }

    }
}
