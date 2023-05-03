package hexlet.code;

import java.util.Scanner;

import static hexlet.code.Engine.expression;
import static hexlet.code.Engine.randonIntNum;


public class Calc {


    public static void calculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("Can I have your name? ");
        var userName = scanner.next();
        System.out.print("Hello, " + userName + "!");
        System.out.println("What is the result for the expression?");

        //генирируем первое число
        var firstNum1 = randonIntNum();
        var secondNum1 = randonIntNum();
        var expression1 = expression();
        var expressionRes1 = 0;

        switch (expression1) {
            case "+":
                expressionRes1 = firstNum1 + secondNum1;
                break;
            case "-":
                expressionRes1 = firstNum1 - secondNum1;
                break;
            case "*":
                expressionRes1 = firstNum1 * secondNum1;
                break;
            case "/":
                expressionRes1 = firstNum1 / secondNum1;
                break;
        }


        System.out.println("Question: " + firstNum1 + " " + expression1 + " " + secondNum1);
        System.out.print("Your answer: ");
        var answer = scanner.next();


        int winCount = 0;


        // Проверка вопрос 1: правильно. Тип данных ответа обязательно должен совпасть с типом данных проверяющего параметра
        if (answer.equals(String.valueOf(expressionRes1))) {
            System.out.println("Correct!");
            winCount += 1;
        }

        // Проверка вопрос 1: неправильно
        if (!(answer.equals(String.valueOf(expressionRes1)))) {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + expressionRes1 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        // Если условие выполнилось, генерируем второй пример
        var firstNum2 = randonIntNum();
        var secondNum2 = randonIntNum();
        var expression2 = expression();
        var expressionRes2 = 0;

        switch (expression2) {
            case "+":
                expressionRes2 = firstNum2 + secondNum2;
                break;
            case "-":
                expressionRes2 = firstNum2 - secondNum2;
                break;
            case "*":
                expressionRes2 = firstNum2 * secondNum2;
                break;
            case "/":
                expressionRes2 = firstNum2 / secondNum2;
                break;
        }


        System.out.println("Question: " + firstNum2 + " " + expression2 + " " + secondNum2);

        System.out.print("Your answer: ");
        var answer2 = scanner.next();

        // Проверка вопрос 2: правильно

        if (answer2.equals(String.valueOf(expressionRes2))) {
            System.out.println("Correct!");
            winCount += 1;
        }

        // Проверка вопрос 2: неправильно
        if (!(answer2.equals(String.valueOf(expressionRes2)))) {
            System.out.println("'" + answer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + expressionRes2 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        // Если условие выполнилось, генерируем третий пример
        var firstNum3 = randonIntNum();
        var secondNum3 = randonIntNum();
        var expression3 = expression();
        var expressionRes3 = 0;


        switch (expression3) {
            case "+":
                expressionRes3 = firstNum3 + secondNum3;
                break;
            case "-":
                expressionRes3 = firstNum3 - secondNum3;
                break;
            case "*":
                expressionRes3 = firstNum3 * secondNum3;
                break;
            case "/":
                expressionRes3 = firstNum3 / secondNum3;
                break;
        }


        System.out.println("Question: " + firstNum3 + " " + expression3 + " " + secondNum3);

        System.out.print("Your answer: ");
        var answer3 = scanner.next();

        // Проверка вопрос 3: правильно
        if (answer3.equals(String.valueOf(expressionRes3))) {
            System.out.println("Correct!");
            winCount += 1;
        }

        // Проверка вопрос 3: неправильно
        if (!(answer3.equals(String.valueOf(expressionRes3)))) {
            System.out.println("'" + answer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + expressionRes3 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        //* если ответ был дан верно 3 раза, игра завершается победой
        if (winCount == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
