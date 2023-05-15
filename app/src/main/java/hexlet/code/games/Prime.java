package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Prime {
    static final String GAME_DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int num) {
        BigInteger bigInt = BigInteger.valueOf(num);
        return bigInt.isProbablePrime((int) Math.log(num));
    }

    public static String[] generateRound() {
        String[] res = new String[2];
        int randomNumber = Utils.getRandomNumber();
        res[0] = Integer.toString(randomNumber);
        res[1] = isPrime(randomNumber) ? "yes" : "no";
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
