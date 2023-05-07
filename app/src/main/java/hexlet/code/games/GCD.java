package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Utils.gcd;
import static hexlet.code.Utils.randonIntNum;

public class GCD {
        public static Scanner scanner = new Scanner(System.in);
        public static String TASK = "Find greatest common divisor of given numbers";

    public static void getGCD() {

        System.out.print("Can I have your name? ");
        var userName = scanner.next();
        System.out.print("Hello, " + userName + "!");
        System.out.println(TASK);

        int firstNum = randonIntNum();
        int secondNum = randonIntNum();
        int gcd1 = gcd(firstNum, secondNum);


        System.out.println("Question: " + firstNum + " " + secondNum);
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


        int firstNum2 = randonIntNum();
        int secondNum2 = randonIntNum();
        int gcd2 = gcd(firstNum2, secondNum2);


        System.out.println("Question: " + firstNum2 + " " + secondNum2);
        System.out.print("Your answer: ");
        var answer2 = scanner.next();

        //Проверка ко второму примеру
        if (Integer.parseInt(answer2) == gcd2) {
            System.out.println("Correct!");
        }
        if (!(Integer.parseInt(answer2) == gcd2)) {
            System.out.println("'" + answer2 + "'" + "is wrong answer ;(. Correct answer was " + gcd2);
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        //генерируем 3-й пример
        int firstNum3 = randonIntNum();
        int secondNum3 = randonIntNum();
        int gcd3 = gcd(firstNum3, secondNum3);

        System.out.println("Question: " + firstNum3 + " " + secondNum3);
        System.out.print("Your answer: ");
        var answer3 = scanner.next();

        // проверка третьего примера
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
