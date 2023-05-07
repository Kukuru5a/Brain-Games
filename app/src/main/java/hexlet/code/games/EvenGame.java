package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Utils.randonIntNum;


public class EvenGame {

    public static String TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("Can I have your name? ");
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(TASK);

        var firsNum = randonIntNum(); // генерируем первое число
        var secondNum = randonIntNum(); // генерируем второе число
        var thirdNum = randonIntNum(); // генерируем третье число

        System.out.println("Question:" + firsNum);
        System.out.print("Your answer: ");
        var answer = scanner.next();

        var numChecker = ""; // на основании этого, мы будем определять, правильный ли ответ дал пользователь



        // проверка первого числа на четность
        if (firsNum % 2 == 0) {
            numChecker = "yes";
        } else {
            numChecker = "no";
        }
        // Вопрос 1
        if ((answer.equals("yes") && numChecker.equals("yes")) || (answer.equals("no") && numChecker.equals("no"))) {
            System.out.println("Correct!");
            System.out.println("Question:" + secondNum);
        }
        if ((answer.equals("yes") && numChecker.equals("no")) || (answer.equals("no") && numChecker.equals("yes")) || (!(answer.equals("yes")) && !(answer.equals("no")))) {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + numChecker + "'" + ".");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
        // *разделяем вопрос ответ*
        // Вопрос 2
        // проверка второго числа
        System.out.print("Your answer: ");
        var answer2 = scanner.next();

        if (secondNum % 2 == 0) {
            numChecker = "yes";
        } else {
            numChecker = "no";
        }

        if ((answer2.equals("yes") && numChecker.equals("yes")) || (answer2.equals("no") && numChecker.equals("no"))) {
            System.out.println("Correct!");
            System.out.println("Question:" + thirdNum);

        }
        if ((answer2.equals("yes") && numChecker.equals("no")) || (answer2.equals("no") && numChecker.equals("yes")) || (!(answer2.equals("yes")) && !(answer2.equals("no")))) {
            System.out.println("'" + answer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + numChecker + "'" + ".");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
        // Вопрос 3
        // проверка третьего числа

        System.out.print("Your answer: ");
        var answer3 = scanner.next();

        if (thirdNum % 2 == 0) {
            numChecker = "yes";
        } else {
            numChecker = "no";
        }


        if ((answer3.equals("yes") && numChecker.equals("yes")) || (answer3.equals("no") && numChecker.equals("no")) || (!(answer3.equals("yes")) && !(answer3.equals("no")))) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }
        if ((answer3.equals("yes") && numChecker.equals("no")) || (answer3.equals("no") && numChecker.equals("yes"))) {
            System.out.println("'" + answer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + numChecker + "'" + ".");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
    }
}