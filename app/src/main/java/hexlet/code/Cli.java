package hexlet.code;
import java.util.Scanner;


public class Cli {
    public static void playerWelcome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Can I have your name? ");
        var userName = sc.next();
        System.out.print("Hello, " + userName + "!");
        sc.close();
    }

}


