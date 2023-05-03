package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 3 - Calc \n 0 - Exit");
        System.out.print("Your choice: ");
        var numChoice = scanner.next();

        if (numChoice.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
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

    }
}