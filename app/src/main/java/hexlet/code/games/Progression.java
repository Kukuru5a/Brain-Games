package hexlet.code.games;
import java.util.Scanner;
import static hexlet.code.Engine.userName;
import static hexlet.code.Templates.*;
import static hexlet.code.Utils.*;

public class Progression {

    static Scanner scanner = new Scanner(System.in);
    public static String TASK = "What number is missing in the progression?";
    public static void getProgression() {
        String progression = progression();
        var modifiedProg = missingElement(progression, index1);

        System.out.println(TASK);
        System.out.println("Question: " + modifiedProg.trim());
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();
        String[] splitProgression = progression.split(",");

        if (Integer.toString(answer).equals(splitProgression[index1].trim())) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + splitProgression[index1].trim() + "'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        String progression2 = progression();
        var modifiedProg2 = missingElement(progression2, index2);
        String[] splitProgression2 = progression2.split(",");

        System.out.println("Question: " + modifiedProg2.trim());
        System.out.print("Your answer: ");
        var answer2 = scanner.nextInt();

        if (Integer.toString(answer2).equals(splitProgression2[index2].trim())) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + splitProgression2[index2].trim() + "'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
        var progression3 = progression();
        var modifiedProg3 = missingElement(progression3, index3);
        String[] splitProgression3 = progression3.split(",");
        System.out.println("Question: " + modifiedProg3.trim());
        System.out.print("Your answer: ");
        var answer3 = scanner.nextInt();

        if (Integer.toString(answer3).equals(splitProgression3[index3].trim())) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + answer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + splitProgression3[index3].trim() + "'.");
            System.out.println("Let's try again, " + userName + "!");
            System.exit(0);
        }
    }
}
