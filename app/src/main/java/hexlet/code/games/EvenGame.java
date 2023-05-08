package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.userName;
import static hexlet.code.Templates.*;

public class EvenGame {

    public static Scanner scanner = new Scanner(System.in);
    public static String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenGame() {
        System.out.println(TASK);
        System.out.println("Question:" + num1);
        System.out.print("Your answer: ");
        var answer = scanner.next();

        if ((answer.equals(checker1))) {
            System.out.println("Correct!");
            System.out.println("Question:" + num2);
        }
        if (!(answer.equals(checker1))) {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + checker1 + "'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

        System.out.print("Your answer: ");
        var answer2 = scanner.next();

        if (answer2.equals(checker2)) {
            System.out.println("Correct!");
            System.out.println("Question:" + num3);
        }
        if (!(answer2.equals(checker2))) {
            System.out.println("'" + answer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + checker2 + "'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }

        System.out.print("Your answer: ");
        var answer3 = scanner.next();

        if (answer3.equals(checker3)) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (!(answer3.equals(checker3))) {
            System.out.println("'" + answer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + checker3 + "'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
    }
}
