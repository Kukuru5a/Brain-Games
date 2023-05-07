package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.EvenGame;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;

import java.util.Random;
import java.util.Scanner;

import static hexlet.code.Utils.numGenerator;


// основа, на которой будут работать все игры
public class Engine {
    // элементы игры
    static Scanner scanner = new Scanner(System.in);


    // введение в игру
    public static void runEngine() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 3 - Calc \n 4 - GCD \n 5 - Progression \n 0 - Exit");
        System.out.print("Your choice: ");
        var numChoice = scanner.next();



        if (numChoice.equals("1")) {
            System.out.print("Can I have your name? ");
            var userName = scanner.next();
            System.out.print("Hello, " + userName + "!");
            scanner.close();
        }

        if (numChoice.equals("2")) {
            EvenGame.evenGame();
            scanner.close();
        }

        if (numChoice.equals("3")) {
            Calc.calculator();
            scanner.close();
        }

        if (numChoice.equals("4")) {
            GCD.getGCD();
            scanner.close();
        }

        if (numChoice.equals("5")) {
            Progression.getProgression();
            scanner.close();
        }
    }


}
