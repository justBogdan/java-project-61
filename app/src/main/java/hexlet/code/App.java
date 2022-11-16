package hexlet.code;
import java.util.Scanner;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Greeting;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    private  static String gameNumber;
    static final int GREETING_NUM = 1;
    static final int EVEN_NUM = 2;
    static final int CALC_NUM = 3;
    static final int GCD_NUM = 4;
    static final int PROGRESSION_NUM = 5;
    static final int PRIME_NUM = 6;
    static final int EXIT_NUM = 0;
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

        var calcCondition = "What is the result of the expression?";
        var evenCondition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        var gcdCondition = "Find the greatest common divisor of given numbers.";
        var primeCondition = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        var progressionCondition = "What number is missing in the progression?";

        if (parsedNumber == GREETING_NUM) {
            Greeting.greeting();
        }
        if (parsedNumber == EVEN_NUM) {
            Engine.init(Even.even(), evenCondition);
        }
        if (parsedNumber == CALC_NUM) {
            Engine.init(Calc.calc(), calcCondition);
        }
        if (parsedNumber == GCD_NUM) {
            Engine.init(GCD.gcd(), gcdCondition);
        }
        if (parsedNumber == PROGRESSION_NUM) {
            Engine.init(Progression.progression(), progressionCondition);
        }
        if (parsedNumber == PRIME_NUM) {
            Engine.init(Prime.prime(), primeCondition);
        }
        if (parsedNumber == EXIT_NUM) {
            scanner.close();
        }
    }
}
