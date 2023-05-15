package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class GCD {
    private static final String GAME_DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static int getGcd(int num1, int num2) {
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

    public static String[] generateRound() {
        String[] res = new String[2];
        int randomNumber = Utils.getRandomNumber();
        int randomNumber2 = Utils.getRandomNumber();
        res[0] = randomNumber + " " + randomNumber2;
        res[1] = Integer.toString(getGcd(randomNumber, randomNumber2));
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
