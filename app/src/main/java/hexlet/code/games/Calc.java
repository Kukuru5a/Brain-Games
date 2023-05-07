package hexlet.code.games;

import java.util.Scanner;

import static hexlet.code.Utils.*;




public class Calc {

    public static Scanner scanner = new Scanner(System.in);
    public static String TASK = "What is the result for the expression?";
    public static void calculator() {
        System.out.print("Can I have your name? ");
        var userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(TASK);

        System.out.println();
        int firstNum1 = randonIntNum();
        int secondNum1 = randonIntNum();
        var expression1 = expression();

        System.out.println("Question: " + firstNum1 + " " + expression1 + " " + secondNum1);
        System.out.print("Your answer: ");
        var answer = scanner.next();
        var expressionRes1 = getExpression(firstNum1, secondNum1, expression1);


        // Проверка вопрос 1: правильно. Тип данных ответа обязательно должен совпасть с типом данных проверяющего параметра
        if (answer.equals(String.valueOf(expressionRes1))) {
            System.out.println("Correct!");

        }

        // Проверка вопрос 1: неправильно
        if (!(answer.equals(String.valueOf(expressionRes1)))) {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + expressionRes1 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        int firstNum2 = randonIntNum();
        int secondNum2 = randonIntNum();
        var expression2 = expression();

        System.out.println("Question: " + firstNum2 + " " + expression2 + " " + secondNum2);
        System.out.print("Your answer: ");
        var answer2 = scanner.next();
        var expressionRes2 = getExpression(firstNum2, secondNum2, expression2);


        // Проверка вопрос 2: правильно

        if (answer2.equals(String.valueOf(expressionRes2))) {
            System.out.println("Correct!");
        }

        // Проверка вопрос 2: неправильно
        if (!(answer2.equals(String.valueOf(expressionRes2)))) {
            System.out.println("'" + answer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + expressionRes2 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        // Если условие выполнилось, генерируем третий пример
        int firstNum3 = randonIntNum();
        int secondNum3 = randonIntNum();
        var expression3 = expression();

        System.out.println("Question: " + firstNum3 + " " + expression3 + " " + secondNum3);
        System.out.print("Your answer: ");
        var answer3 = scanner.next();
        var expressionRes3 = getExpression(firstNum3, secondNum3, expression3);

        // Проверка вопрос 3: правильно
        if (answer3.equals(String.valueOf(expressionRes3))) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        }

        // Проверка вопрос 3: неправильно
        if (!(answer3.equals(String.valueOf(expressionRes3)))) {
            System.out.println("'" + answer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + expressionRes3 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
    }
}
