package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Engine.userName;
import static hexlet.code.Templates.*;


public class Calc {

    public static Scanner scanner = new Scanner(System.in);
    public static String TASK = "What is the result for the expression?";
    public static void calculator() {
        System.out.println(TASK);
        System.out.println("Question: " + nums1[0] + " " + expression1 + " " + nums1[1]);
        System.out.print("Your answer: ");
        var answer = scanner.next();

        if (answer.equals(String.valueOf(getExpression1))) {
            System.out.println("Correct!");
        }
        if (!(answer.equals(String.valueOf(getExpression1)))) {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + getExpression1 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        System.out.println("Question: " + nums2[0] + " " + expression2 + " " + nums2[1]);
        System.out.print("Your answer: ");
        var answer2 = scanner.next();

        if (answer2.equals(String.valueOf(getExpression2))) {
            System.out.println("Correct!");
        }
        if (!(answer2.equals(String.valueOf(getExpression2)))) {
            System.out.println("'" + answer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + getExpression2 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        System.out.println("Question: " + nums3[0] + " " + expression3 + " " + nums3[1]);
        System.out.print("Your answer: ");
        var answer3 = scanner.next();

        if (answer3.equals(String.valueOf(getExpression3))) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (!(answer3.equals(String.valueOf(getExpression3)))) {
            System.out.println("'" + answer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + getExpression3 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
    }
}
