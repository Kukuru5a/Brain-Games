package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class EvenGame {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static String[] generateRound() {
        String[] res = new String[2];
        int randomNumber = Utils.getRandomNumber();
        res[0] = Integer.toString(randomNumber);
        res[1] = isEven(randomNumber) ? "yes" : "no";
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
