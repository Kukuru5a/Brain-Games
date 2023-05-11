package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int WIN_POINTS = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void run(String[][] gameData, String gameDescription) {
        int index = 0;
        String answer;
        Scanner sc = new Scanner(System.in);

        System.out.print("Welcome to the Brain Games! \nMay I have your name? ");
        String userName = sc.next();
        System.out.println("Hello " + userName + "!");
        System.out.println(gameDescription);
        while (index < WIN_POINTS) {
            System.out.println("Question: " + gameData[index][QUESTION]);
            System.out.print("Your answer: ");
            answer = sc.next();
            if (answer.equals(gameData[index][ANSWER])) {
                System.out.println("Correct!");
                index++;
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer is '" + gameData[index][ANSWER] + "'.");
                System.out.println("Let's try again " + userName + "!");
                sc.close();
                return;
            }
        }
        System.out.println("Congratulation " + userName + "!");
    }
}
