package hexlet.code.games;
import java.util.Scanner;
import static hexlet.code.Engine.userName;
import static hexlet.code.Templates.*;
import static hexlet.code.Utils.*;

public class Progression {

    static Scanner scanner = new Scanner(System.in);
    public static String TASK = "What number is missing in the progression?";
    public static void getProgression() {
        //генерируем прогрессию
        String progression = progression();
        //модифицируем ее, заменяя рандомное число на '..'
        var modifiedProg = missingElement(progression, index1);

        System.out.println(TASK);
        System.out.println("Question: " + modifiedProg);
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();

        var splitProg = progression.split(",");

        if (Integer.toString(answer).equals(splitProg[index1].trim())) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + splitProg[index1].trim() + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        var progression2 = progression();
        var modifiedProg2 = missingElement(progression2, index2);

        System.out.println("Question: " + modifiedProg2);
        System.out.print("Your answer: ");
        var answer2 = scanner.nextInt();
        var splitProg2 = progression2.split(",");


        if (Integer.toString(answer2).equals(splitProg2[index2].trim())) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer2 + "'" + " is wrong answer ;(. Correct answer was " + "'" + splitProg2[index2].trim() + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }

        var prog3 = progression();
        var modifiedProg3 = missingElement(prog3, index3);

        System.out.println("Question: " + modifiedProg3);
        System.out.print("Your answer: ");
        var answer3 = scanner.nextInt();

        var splitProg3 = prog3.split(",");

        if (Integer.toString(answer3).equals(splitProg3[index3].trim())) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + answer3 + "'" + " is wrong answer ;(. Correct answer was " + "'" + splitProg3[index3].trim() + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }
    }
}
