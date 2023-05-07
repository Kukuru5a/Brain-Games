package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

// основа, на которой будут работать все игры
public class Engine {
    // элементы игры
    static Scanner scanner = new Scanner(System.in);
    public static String userName;

    // введение в игру
    public static void runEngine() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 3 - Calc \n 4 - GCD \n 5 - Progression \n 6 - Prime \n 0 - Exit");
        System.out.print("Your choice: ");
        var numChoice = scanner.next();


        if (numChoice.equals("1")) {
            System.out.print("Can I have your name? ");
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            scanner.close();
        }

        if (numChoice.equals("2")) {
            System.out.print("Can I have your name? ");
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            EvenGame.evenGame();
            scanner.close();
        }

        if (numChoice.equals("3")) {
            System.out.print("Can I have your name? ");
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            Calc.calculator();
            scanner.close();
        }

        if (numChoice.equals("4")) {
            System.out.print("Can I have your name? ");
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            GCD.getGCD();
            scanner.close();
        }

        if (numChoice.equals("5")) {
            System.out.print("Can I have your name? ");
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            Progression.getProgression();
            scanner.close();
        }

        if (numChoice.equals("6")) {
            System.out.print("Can I have your name? ");
            userName = scanner.next();
            System.out.println("Hello, " + userName + "!");
            Prime.isPrime();
            scanner.close();
        }
    }
}
