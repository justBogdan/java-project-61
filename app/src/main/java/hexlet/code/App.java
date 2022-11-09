package hexlet.code;
import java.util.Scanner;

public class App {
    public static String gameNumber;
    public static void main(String[] args) {
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice? ");
        gameNumber = scanner.next();
        Engine.Start(Integer.parseInt(gameNumber));
    }
}
