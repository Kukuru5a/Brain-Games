package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.WIN_POINTS;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class Calc {
    private static final Random RANDOM = new Random();
    public static String gameDescription = "What is the result of the expression?";
    private static final String[] EXPRESSION_LIST = {"+", "-", "*"};

    public static int expression(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> throw new RuntimeException("Unexpected operator");
        };
    }

    public static void calculator() {
        String[][] gameData = new String[WIN_POINTS][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = RANDOM.nextInt(100);
            int randomNumber2 = RANDOM.nextInt(100);
            gameData[i][QUESTION] = randomNumber + " " + EXPRESSION_LIST[i] + " " + randomNumber2;
            gameData[i][ANSWER] = Integer.toString(expression(randomNumber, randomNumber2, EXPRESSION_LIST[i]));
        }
        Engine.run(gameData, gameDescription);
    }
}
