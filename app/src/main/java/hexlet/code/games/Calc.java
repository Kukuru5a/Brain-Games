package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.WIN_POINTS;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class Calc {
    private static final Random RANDOM = new Random();
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final int MAX_NUM = 100;
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
            int randomNumber = RANDOM.nextInt(MAX_NUM);
            int randomNumber2 = RANDOM.nextInt(MAX_NUM);
            gameData[i][QUESTION] = randomNumber + " " + EXPRESSION_LIST[i] + " " + randomNumber2;
            gameData[i][ANSWER] = Integer.toString(expression(randomNumber, randomNumber2, EXPRESSION_LIST[i]));
        }
        Engine.run(gameData, GAME_DESCRIPTION);
    }
}
