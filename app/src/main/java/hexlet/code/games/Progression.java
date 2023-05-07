package hexlet.code.games;
import java.util.Arrays;
import java.util.Scanner;
import static hexlet.code.Utils.randonIntNum;

public class Progression {



    public static String progression() {
        int diff = randonIntNum();
        int start = randonIntNum();//start num
        int n = 11;//length
        int[] elements = new int[n];
        for (int i = 1; i < n; i++) {
            elements[i] = start + diff * i;// i - element of progression
        }
        var str = Arrays.toString(elements);
        var modifiedstr1 = str.trim().replace(',', ' ');
        return str.substring(4,str.length()-1);
    }

    static int index1 = (int)(Math.random()*10);
    static int index2 = (int)(Math.random()*10);
    static int index3 = (int)(Math.random()*10);


    public static String missingElement(String prog, int index) {
        String[] splitStr = prog.split(",");
        splitStr[index] = "..";
        var res = Arrays.toString(splitStr);
        return res;
    }


    public static void getProgression() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("Can I have your name? ");
        var userName = scanner.next();
        System.out.print("Hello, " + userName + "!");


        //генерируем прогрессию
        String prog = progression();
        //модифицируем ее, заменяя рандомное число на '..'
        var modifiedProg = missingElement(prog, index1);


        System.out.println("Question: " + modifiedProg);
        System.out.print("Your answer: ");
        int answer = scanner.nextInt();


        var splitProg = prog.split(",");


        //проверка первого примера
        if (Integer.toString(answer).equals(splitProg[index1].trim())) {
            System.out.println("Correct!");
        } else {
            System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was " + "'" + splitProg[index1].trim() + "'");
            System.out.println("Let's try again, " + userName);
            System.exit(0);
        }


        var prog2 = progression();


        var modifiedProg2 = missingElement(prog2, index2);

        System.out.println("Question: " + modifiedProg2);

        System.out.print("Your answer: ");
        var answer2 = scanner.nextInt();

        var splitProg2 = prog2.split(",");


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
