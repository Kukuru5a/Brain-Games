package hexlet.code;
import java.util.Scanner;
import java.util.Random;

public class Cli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("Can I have your name?");
        var userName = scanner.next();
        System.out.print("Hello, " + userName + "!");

        scanner.close();
    }

}


