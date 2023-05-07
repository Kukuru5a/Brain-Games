package hexlet.code;

import java.util.Arrays;
import java.util.Random;

public class Utils {
    public static int numGenerator() {
        Random ranNum = new Random();
        var numInt = ranNum.nextInt(0, 4);
        return numInt;
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

    public static String expression() {
        String res = "";
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

    public static int getExpression(int num1, int num2, String expression){

        var expressionRes = 0;

        switch (expression) {
            case "+":
                expressionRes = num1 + num2;
                break;
            case "-":
                expressionRes = num1 - num2;
                break;
            case "*":
                expressionRes = num1 * num2;
                break;
            case "/":
                expressionRes = num1 / num2;
                break;
        }
        return expressionRes;
    }









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


}
