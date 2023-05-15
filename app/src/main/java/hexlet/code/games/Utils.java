package hexlet.code.games;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();
    private static final int MAX = 100;

    public static int getRandomNumber(int number) {
        return RANDOM.nextInt(number);
    }

    public static int getRandomNumber() {
        return RANDOM.nextInt(MAX);
    }
}
