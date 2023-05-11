package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.WIN_POINTS;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class Prime {
    private static final Random RANDOM = new Random();
    static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static final int MAX_NUM = 100;

    public static String isPrime(int num) {
        String res = "";
        int flag = 0;
        int m = num / 2;
        if (num == 0 || num == 1) {
            res = "no";
        } else {
            for (int i = 2; i < m; i++) {
                if (num % i == 0) {
                    res = "no";
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                res = "yes";
            }
        }
        return res;
    }

    public static void isPrime() {
        String[][] gameData = new String[WIN_POINTS][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = RANDOM.nextInt(MAX_NUM);
            gameData[i][QUESTION] = Integer.toString(randomNumber);
            gameData[i][ANSWER] = isPrime(randomNumber);
        }
        Engine.run(gameData, GAME_DESCRIPTION);
    }
}
