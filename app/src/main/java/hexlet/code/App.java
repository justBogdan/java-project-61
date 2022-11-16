package hexlet.code;
import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Greeting;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    private static String gameNumber;
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
        var greetingNum = 1;
        var evenNum = 2;
        var calcNum = 3;
        var gcdNum = 4;
        var progressionNum = 5;
        var primeNum = 6;
        var exitNum = 0;

        var calcCondition = "What is the result of the expression?";
        var evenCondition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var gcdCondition = "Find the greatest common divisor of given numbers.";
        var primeCondition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var progressionCondition = "What number is missing in the progression?";
        if (parsedNumber == greetingNum) {
            Greeting.greeting();
        }
        if (parsedNumber == evenNum) {
            Engine.init(Even.even(), evenCondition);
        }
        if (parsedNumber == calcNum) {
            Engine.init(Calc.calc(), calcCondition);
        }
        if (parsedNumber == gcdNum) {
            Engine.init(GCD.gcd(), gcdCondition);
        }
        if (parsedNumber == progressionNum) {
            Engine.init(Progression.progression(), progressionCondition);
        }
        if (parsedNumber == primeNum) {
            Engine.init(Prime.prime(), primeCondition);
        }
        if (parsedNumber == exitNum) {
            scanner.close();
        }
    }
}
