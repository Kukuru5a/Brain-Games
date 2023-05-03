package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Engine.randonIntNum;


public class EvenGame {


    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("Can I have your name? ");
        var userName = scanner.next();
        System.out.print("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        //создаем генратор чисел


        var firsNum = randonIntNum(); // генерируем первое число
        var secondNum = randonIntNum(); // генерируем второе число
        var thirdNum = randonIntNum(); // генерируем третье число

        System.out.println("Question:" + firsNum);
        System.out.print("Your answer: ");
        var answer = scanner.next();

        var numChecker = ""; // на основании этого, мы будем определять, правильный ли ответ дал пользователь
        int winCount = 0;


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
            winCount += 1;
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
            winCount += 1;
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
            winCount += 1;
        }
        if ((answer3.equals("yes") && numChecker.equals("no")) || (answer3.equals("no") && numChecker.equals("yes"))) {
            System.out.println("'" + answer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + numChecker + "'" + ".");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
        //* если ответ был дан верно 3 раза, игра завершается победой
        if (winCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
