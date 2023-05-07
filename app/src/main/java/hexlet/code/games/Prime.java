package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.userName;
import static hexlet.code.games.Calc.scanner;
import static hexlet.code.Templates.*;

public class Prime {
    static final String TASK = "Answer 'yes' if number is prime. Otherwise answer 'no'.";
    public static void isPrime() {
        System.out.println(TASK);
        System.out.println("Question: " + num1);
        System.out.print("Your answer: ");
        var answer1 = scanner.next();

        var checker = Utils.isPrime(num1);

        if (answer1.equals(checker)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer1 + "'" + " is wrong, correct answer is " + "'" + checker + "'");
            System.exit(0);
        }

        System.out.println("Question: " + num2);
        System.out.print("Your answer: ");
        var answer2 = scanner.next();

        var checker2 = Utils.isPrime(num2);

        if (answer2.equals(checker2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer2 + "'" + " is wrong, correct answer is " + "'" + checker2 + "'");
            System.exit(0);
        }

        System.out.println("Question: " + num3);
        System.out.print("Your answer: ");
        var answer3 = scanner.next();

        var checker3 = Utils.isPrime(num3);

        if (answer3.equals(checker3)) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + answer3 + "'" + " is wrong, correct answer is " + "'" + checker3 + "'");
            System.exit(0);
        }
    }
}
