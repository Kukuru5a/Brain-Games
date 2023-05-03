package hexlet.code;

import java.util.Random;
import java.util.Scanner;


// основа, на которой будут работать все игры
public class Engine {
    // элементы игры
    public static int numGenerator() {
        var numDouble = Math.random();
        Random ranNum = new Random();
        var numInt = ranNum.nextInt(0, 4);
        return numInt;
    }

    public static String expression() {
        String res = "+";
        var a = "+";
        var b = "-";
        var c = "*";
        var d = "/";
        String[] expressions = {a, b, c, d};
        for (int i = 0; i < expressions.length; i++) {
            var expressionIndex = numGenerator();
            res = expressions[expressionIndex];
        }
        return res;
    }

    public static int randonIntNum() {
        double min = 0.0;
        double max = 10.0;
        Random ranNum = new Random();
        int randNum = ranNum.nextInt(1, 100); // генерируем число от 1 до 100

        var requestedNumDouble = Math.random() * 10;
        var requestedNumInt = (int) requestedNumDouble; // генерируем число
        return randNum;
    }


    // введение в игру
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter. \n 1 - Greet \n 2 - Even \n 3 - Calc \n 0 - Exit");
        System.out.print("Your choice: ");
        var numChoice = scanner.next();

        if (numChoice.equals("1")) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("Can I have your name? ");
            var userName = scanner.next();
            System.out.print("Hello, " + userName + "!");
            scanner.close();
        }
        if (numChoice.equals("2")) {
            EvenGame.evenGame();
            scanner.close();
        }
        if (numChoice.equals("3")) {
            Calc.calculator();
            scanner.close();
        }
    }


    // кор игр
    public static void gameCore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("Can I have your name? ");
        var userName = scanner.next();
        System.out.print("Hello, " + userName + "!");
        System.out.println("Question?");

        //задается вопрос с примером
        //ответ
        var answer = scanner.next();
        //далее в проверке каждой игры, если ответ правильный, мы прибавляем очко
        var winCounter = 0;


    }
}
