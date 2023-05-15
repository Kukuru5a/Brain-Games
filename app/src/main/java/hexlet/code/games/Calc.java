package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Calc {
    private static final String GAME_DESCRIPTION = "What is the result of the expression?";
    private static final String[] EXPRESSION_LIST = {"+", "-", "*"};
    private static final int EXPRESSION_COUNT = 3;

    public static int getExpression(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            default -> throw new RuntimeException("Unexpected operator");
        };
    }

    public static String[] generateRound() {
        String[] res = new String[2];
        int randomNumber = Utils.getRandomNumber();
        int randomNumber2 = Utils.getRandomNumber();
        String expression = EXPRESSION_LIST[Utils.getRandomNumber(EXPRESSION_COUNT)];
        res[0] = randomNumber + " " + expression + " " + randomNumber2;
        res[1] = Integer.toString(getExpression(randomNumber, randomNumber2, expression));
        return res;
    }

    public static void runGame() {
        String[][] gameData = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < gameData.length; i++) {
            gameData[i] = generateRound();
        }
        Engine.run(gameData, GAME_DESCRIPTION);
    }
}
