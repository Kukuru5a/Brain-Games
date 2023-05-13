package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

import static hexlet.code.Cli.playerWelcome;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("""
                 1 - Greet\s
                 2 - Even\s
                 3 - Calc\s
                 4 - GCD\s
                 5 - Progression\s
                 6 - Prime\s
                 0 - Exit \
                """);
        System.out.print("Your choice: ");
        var numChoice = scanner.next();
        switch (numChoice) {
            case "1" -> playerWelcome();
            case "2" -> EvenGame.runGame();
            case "3" -> Calc.runGame();
            case "4" -> GCD.runGame();
            case "5" -> Progression.runGame();
            case "6" -> Prime.runGame();
            case "0" -> System.exit(0);
            default -> System.out.println("There is no such game.");
        }
    }
}
