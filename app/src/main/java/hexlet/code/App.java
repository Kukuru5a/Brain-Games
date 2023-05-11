package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

import static hexlet.code.Cli.playerWelcome;

public class App {
    private static final String GA1 = " 1 - Greet ";
    private static final String GA2 = " 2 - Even ";
    private static final String GA3 = " 3 - Calc ";
    private static final String GA4 = " 4 - GCD ";
    private static final String GA5 = " 5 - Progression ";
    private static final String GA6 = " 6 - Prime ";
    private static final String GA0 = " 0 - Exit ";
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void runGame() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter.");
        System.out.println(GA1 + "\n" + GA2 + "\n" + GA3 + "\n" + GA4 + "\n" + GA5 + "\n" + GA6 + "\n" + GA0);
        System.out.print("Your choice: ");
        var numChoice = SCANNER.next();
        if (numChoice.equals("1")) {
            playerWelcome();
            SCANNER.close();
        }
        if (numChoice.equals("2")) {
            EvenGame.evenGame();
            SCANNER.close();
        }
        if (numChoice.equals("3")) {
            Calc.calculator();
            SCANNER.close();
        }
        if (numChoice.equals("4")) {
            GCD.getGCD();
            SCANNER.close();
        }
        if (numChoice.equals("5")) {
            Progression.getProgression();
            SCANNER.close();
        }
        if (numChoice.equals("6")) {
            Prime.isPrime();
            SCANNER.close();
        }
    }

    public static void main(String[] args) {
        runGame();
        SCANNER.close();
    }
}
