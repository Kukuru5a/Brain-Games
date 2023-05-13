package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Arrays;

import static hexlet.code.Engine.ROUNDS_COUNT;
import static hexlet.code.Engine.ANSWER;
import static hexlet.code.Engine.QUESTION;

public class Progression {
    private static final String GAME_DESCRIPTION = "What number is missing in the progression?";
    private static final int MAX = 100;
    private static final int INDEX = 9;
    private static final int PROGRESSION_LENGTH = 10;

    public static String[] getProgression(int start, int step, int length) {
        int[] elements = new int[length];
        for (int i = 0; i < length; i++) {
            elements[i] = start + step * i;
        }
        var res = Arrays.toString(elements).replace("[", "")
                .replace("]", "")
                .replace(" ", "");
        return res.split(",");
    }

    public static String missingStatement(String[] progs, int index) {
        String[] modProg = progs.clone();
        modProg[index] = "..";
        return Arrays.toString(modProg).replace("[", "")
                .replace("]", "")
                .replace(",", "");
    }

    public static void runGame() {
        String[][] gameData = new String[ROUNDS_COUNT][2];
        for (int i = 0; i < gameData.length; i++) {
            int index = Utils.randomNumber(INDEX);
            var progression = getProgression(Utils.randomNumber(MAX), Utils.randomNumber(MAX), PROGRESSION_LENGTH);
            gameData[i][QUESTION] = missingStatement(progression, index);
            gameData[i][ANSWER] = progression[index];
        }
        Engine.run(gameData, GAME_DESCRIPTION);
    }
}
