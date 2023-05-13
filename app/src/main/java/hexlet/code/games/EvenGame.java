package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;
import static hexlet.code.Engine.ROUNDS_COUNT;

public class EvenGame {
    private static final String GAME_DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static void runGame() {
        String[][] gameData = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = Utils.randomNumber();
            gameData[i][QUESTION] = Integer.toString(randomNumber);
            gameData[i][ANSWER] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.run(gameData, GAME_DESCRIPTION);
    }
}
