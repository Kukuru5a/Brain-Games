package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.ROUNDS_COUNT;

public class Progression {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int MAX = 100;
    private static final int INDEX = 9;
    private static final int PROGRESSION_LENGTH = 10;

    public static String[] getProgression(int start, int step, int length) {
        String[] elements = new String[length];
        for (int i = 0; i < length; i++) {
            elements[i] = Integer.toString(start + step * i);
        }
        return elements;
    }

    public static String[] generateRound() {
        String[] res = new String[2];
        int index = Utils.getRandomNumber(INDEX);
        var progression = getProgression(Utils.getRandomNumber(MAX), Utils.getRandomNumber(MAX), PROGRESSION_LENGTH);
        res[1] = progression[index];
        progression[index] = "..";
        String modifiedProgression = String.join(" ", progression);
        res[0] = modifiedProgression;
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
