package hexlet.code;
import java.util.Scanner;


public class Cli {
    public static void gameStart() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("Can I have your name?");
        var userName = scanner.next();
        System.out.print("Hello, " + userName + "!");

        scanner.close();
    }

}


