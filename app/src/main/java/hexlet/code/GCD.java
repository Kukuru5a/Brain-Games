package hexlet.code;

import java.util.Scanner;

public class GCD {

    public static int gcd(int a, int b) {
        int res = 0;
        int i = 0;
        while (i <= a && i <= b) {
            i++;
            if (a % i == 0 && b % i == 0) {
                res = i;
            }
        }
        return res;
    }

    public static void getGCD() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("Can I have your name? ");
        var userName = scanner.next();
        System.out.print("Hello, " + userName + "!");
        System.out.println("Find greatest common divisor of given numbers");
        // генерируем первое число
        int firstNum = Engine.randonIntNum();
        // генерируем второе число
        int secondNum = Engine.randonIntNum();
        int gcd1 = gcd(firstNum, secondNum);
        System.out.println("Question: " + firstNum + " " + secondNum);
        //ответ
        System.out.print("Your answer: ");
        var answer = scanner.next();


        //пишем проверку к первому примеру
        int winCounter = 0;

        if (Integer.valueOf(answer) == gcd1) {
            System.out.println("Correct!");
            winCounter += 1;
        }
        if (!(Integer.valueOf(answer) == gcd1)) {
            System.out.println("'" + answer + "'" + "is wrong answer ;(. Correct answer was " + "'" + gcd1 + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        //генерируем второй пример
        int firstNum2 = Engine.randonIntNum();
        int secondNum2 = Engine.randonIntNum();
        int gcd2 = gcd(firstNum2, secondNum2);

        //если ответ на 1 вопрос был верен, переходим ко второму вопросу
        System.out.println("Question: " + firstNum2 + " " + secondNum2);
        System.out.print("Your answer: ");
        var answer2 = scanner.next();

        //Проверка ко второму примеру
        if (Integer.valueOf(answer2) == gcd2) {
            System.out.println("Correct!");
            winCounter += 1;
        }
        if (!(Integer.valueOf(answer2) == gcd2)) {
            System.out.println("'" + answer2 + "'" + "is wrong answer ;(. Correct answer was " + gcd2);
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        //генерируем 3-й пример
        int firstNum3 = Engine.randonIntNum();
        int secondNum3 = Engine.randonIntNum();
        int gcd3 = gcd(firstNum3, secondNum3);

        System.out.println("Question: " + firstNum3 + " " + secondNum3);
        System.out.print("Your answer: ");
        var answer3 = scanner.next();

        // проверка третьего примера
        if (Integer.valueOf(answer3) == gcd3) {
            System.out.println("Correct!");
            winCounter += 1;
        }
        if (!(Integer.valueOf(answer3) == gcd3)) {
            System.out.println("'" + answer3 + "'" + "is wrong answer ;(. Correct answer was " + gcd3);
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        //завершаем игру, если кол-во правильных ответов = 3

        if(winCounter == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }

    }
}
