package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class GCD {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static int gcd(int num1, int num2) {
        int res = 0;
        int i = 0;
        while (i <= num1 && i <= num2) {
            i++;
            if (num1 % i == 0 && num2 % i == 0) {
                res = i;
            }
        }
        return res;
    }

    public static void runGame() {
        String[][] gameData = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = Utils.randomNumber();
            int randomNumber2 = Utils.randomNumber();
            gameData[i][QUESTION] = randomNumber + " " + randomNumber2;
            gameData[i][ANSWER] = Integer.toString(gcd(randomNumber, randomNumber2));
        }
        Engine.run(gameData, GAME_DESCRIPTION);
    }
}
