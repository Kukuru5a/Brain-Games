package hexlet.code.games;

import java.util.Scanner;
import static hexlet.code.Engine.userName;
import static hexlet.code.Templates.*;

public class GCD {
        public static Scanner scanner = new Scanner(System.in);
        public static String TASK = "Find greatest common divisor of given numbers";

    public static void getGCD() {
        System.out.println(TASK);
        System.out.println("Question: " + nums1[0] + " " + nums1[1]);
        System.out.print("Your answer: ");
        var answer = scanner.next();

        if (Integer.parseInt(answer) == gcd1) {
            System.out.println("Correct!");
        }
        if (!(Integer.parseInt(answer) == gcd1)) {
            System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was " + "'" + gcd1 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        System.out.println("Question: " + nums2[0] + " " + nums2[1]);
        System.out.print("Your answer: ");
        var answer2 = scanner.next();

        if (Integer.parseInt(answer2) == gcd2) {
            System.out.println("Correct!");
        }
        if (!(Integer.parseInt(answer2) == gcd2)) {
            System.out.println("'" + answer2 + "'" + "is wrong answer ;(. Correct answer was " + gcd2);
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        System.out.println("Question: " + nums3[0] + " " + nums3[1]);
        System.out.print("Your answer: ");
        var answer3 = scanner.next();

        if (Integer.parseInt(answer3) == gcd3) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if (!(Integer.parseInt(answer3) == gcd3)) {
            System.out.println("'" + answer3 + "'" + "is wrong answer ;(. Correct answer was " + gcd3);
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
    }
}
