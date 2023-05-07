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
        Random ranNum = new Random();
        int randomNum = ranNum.nextInt(1, 100); // генерируем число от 1 до 100
        return randomNum;
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
    public static String isPrime(int n) {
        String res = "";
        int m = 0;
        int i = 0;
        int flag = 0;
        m = n/2;
        if (n == 0||n == 1) {
            res = "no";
        } else {
            for (i = 2; i < m; i++) {
                if (n % i == 0) {
                    res = "no";
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                res = "yes";
            }
        }
        return res;
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

    public static String isEven (int n) {
        String res = "";
        if (n % 2 == 0) {
            res = "yes";
        } else {
            res = "no";
        }
        return res;
    }

    //progression generator
    public static String progression() {
        int diff = randonIntNum();
        int start = randonIntNum();//start num
        int n = 11;//length
        int[] elements = new int[n];
        for (int i = 1; i < n; i++) {
            elements[i] = start + diff * i;// i - element of progression
        }
        var str = Arrays.toString(elements);
        var modifiedstr1 = str.trim().replace(',', ' ');
        return str.substring(4,str.length()-1);
    }

    public static String missingElement(String prog, int index) {
        String[] splitStr = prog.split(",");
        splitStr[index] = "..";
        var res = Arrays.toString(splitStr);
        return res.trim().substring(1, res.length()-1).replace(',', ' ');
    }

}
