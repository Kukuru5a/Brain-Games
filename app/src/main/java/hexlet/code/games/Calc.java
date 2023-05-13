package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final String[] EXPRESSION_LIST = {"+", "-", "*"};

    public static int expression(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> throw new RuntimeException("Unexpected operator");
        };
    }

    public static void runGame() {
        String[][] gameData = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = Utils.randomNumber();
            int randomNumber2 = Utils.randomNumber();
            gameData[i][QUESTION] = randomNumber + " " + EXPRESSION_LIST[i] + " " + randomNumber2;
            gameData[i][ANSWER] = Integer.toString(expression(randomNumber, randomNumber2, EXPRESSION_LIST[i]));
        }
        Engine.run(gameData, GAME_DESCRIPTION);
    }
}
