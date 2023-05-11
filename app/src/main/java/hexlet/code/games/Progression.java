package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;
import java.util.Random;

import static hexlet.code.Engine.WIN_POINTS;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class Progression {
    private static final Random RANDOM = new Random();
    public static String gameDescription = "What number is missing in the progression?";

    public static String progression() {
        int diff = RANDOM.nextInt(100);
        int start = RANDOM.nextInt(100); //start num
        int n = 11;
        int[] elements = new int[n];
        for (int i = 1; i < n; i++) {
            elements[i] = start + diff * i; // i - element of progression
        }
        String str = Arrays.toString(elements);
        return str.substring(4, str.length() - 1).trim();
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
            int index = RANDOM.nextInt(9);
            gameData[i][QUESTION] = missingElement(progression, index);
            gameData[i][ANSWER] = progressions[index].trim();
        }
        Engine.run(gameData, gameDescription);
    }
}
