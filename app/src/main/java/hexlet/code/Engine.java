package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void run(String[][] gameData, String gameDescription) {
        String answer;
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        String userName = sc.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameDescription);
        for (String[] index : gameData) {
            System.out.println("Question: " + index[QUESTION]);
            System.out.print("Your answer: ");
            answer = sc.next();
            if (answer.equals(index[ANSWER])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer is '" + index[ANSWER] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                sc.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
