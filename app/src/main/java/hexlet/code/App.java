package hexlet.code;
import java.util.Scanner;
import java.util.Arrays;

import hexlet.code.games.*;

public class App {
    public static String gameNumber;
    public static void main(String[] args) {
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice? ");
        gameNumber = scanner.next();
        var parsedNumber = Integer.parseInt(gameNumber);
        if (parsedNumber == 1) {
            Greeting.greeting();
        }
        if (parsedNumber == 2) {
            Engine.init(Even.even(),Even.gameCondition);
        }
        if (parsedNumber == 3) {
            Engine.init(Calc.calc(), Calc.gameCondition);
        }
        if (parsedNumber == 4) {
            Engine.init(GCD.gcd(), GCD.gameCondition);
        }
        if (parsedNumber == 5) {
            Engine.init(Progression.progression(), Progression.gameCondition);
        }
        if (parsedNumber == 6) {
            Engine.init(Prime.prime(), Prime.gameCondition);
        }
    }
}
