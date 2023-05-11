package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.WIN_POINTS;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class EvenGame {
    private static final Random RANDOM = new Random();
    private static final String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static final int MAX_NUM = 100;

    private static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static void evenGame() {
        String[][] gameData = new String[WIN_POINTS][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = RANDOM.nextInt(MAX_NUM);
            gameData[i][QUESTION] = Integer.toString(randomNumber);
            gameData[i][ANSWER] = isEven(randomNumber) ? "yes" : "no";
        }
        Engine.run(gameData, gameDescription);
    }
}
