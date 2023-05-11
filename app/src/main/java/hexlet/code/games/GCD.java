package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

import static hexlet.code.Engine.WIN_POINTS;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class GCD {
    public static Random random = new Random();
    public static String gameDescription = "Find the greatest common divisor of given numbers.";

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

    public static void getGCD() {
        String[][] gameData = new String[WIN_POINTS][2];
        for (int i = 0; i < gameData.length; i++) {
            int randomNumber = random.nextInt(100);
            int randomNumber2 = random.nextInt(100);
            gameData[i][QUESTION] = randomNumber + " " + randomNumber2;
            gameData[i][ANSWER] = Integer.toString(gcd(randomNumber, randomNumber2));
        }
        Engine.run(gameData, gameDescription);
    }
}
