package hexlet.code;
import java.util.Scanner;
import hexlet.code.Even;
import hexlet.code.Calc;
import hexlet.code.Engine;
public class App {
    public static String gameNumber;
    public static void main(String[] args) {
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice? ");
        gameNumber = scanner.next();
        var parsedNumber = Integer.parseInt(gameNumber);
        Engine.init(parsedNumber, Even.trulyAnswer, Even.gameCondition);
    }
}
