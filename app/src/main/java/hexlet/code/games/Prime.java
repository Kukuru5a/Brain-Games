package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class Prime {
    static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

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

    public static void runGame() {
        String[][] gameData = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = Utils.randomNumber();
            gameData[i][QUESTION] = Integer.toString(randomNumber);
            gameData[i][ANSWER] = isPrime(randomNumber);
        }
        Engine.run(gameData, GAME_DESCRIPTION);
    }
}
