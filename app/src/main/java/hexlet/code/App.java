package hexlet.code;
import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import static hexlet.code.games.GCD.*;

public class App {
    public static String gameNumber;
    public static void main(String[] args) {
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("0 - Exit");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice? ");
        gameNumber = scanner.next();
        var parsedNumber = Integer.parseInt(gameNumber);
        if (parsedNumber == 1) {
            scanner.close();
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

    }
}
