package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

import static hexlet.code.Engine.WIN_POINTS;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class Progression {
    private static final Random RANDOM = new Random();
    private static final String gameDescription = "What number is missing in the progression?";

    private static final int MAX_NUM = 100;
    private static final int INDEX = 9;
    private static final int STRING_START = 4;
    private static final int PROGRESSION_LENGTH = 11;

    public static String progression() {
        int diff = RANDOM.nextInt(MAX_NUM);
        int start = RANDOM.nextInt(MAX_NUM); //start num
        int n = PROGRESSION_LENGTH;
        int[] elements = new int[n];
        for (int i = 1; i < n; i++) {
            elements[i] = start + diff * i; // i - element of progression
        }
        String str = Arrays.toString(elements);
        return str.substring(STRING_START, str.length() - 1).trim();
    }

    public static String[] progressionToArray(String progression) {
        return progression.split(",");
    }

    public static String missingElement(String progression, int index) {
        String[] splitStr = progression.split(",");
        splitStr[index] = "..";
        String res = Arrays.toString(splitStr);
        return res.substring(1, res.length() - 1).trim().replace(" ", "").replace(",", " ");
    }

    public static void getProgression() {
        String[][] gameData = new String[WIN_POINTS][2];
        for (int i = 0; i < gameData.length; i++) {
            var progression = progression();
            var progressions = progressionToArray(progression);
            int index = RANDOM.nextInt(INDEX);
            gameData[i][QUESTION] = missingElement(progression, index);
            gameData[i][ANSWER] = progressions[index].trim();
        }
        Engine.run(gameData, gameDescription);
    }
}
