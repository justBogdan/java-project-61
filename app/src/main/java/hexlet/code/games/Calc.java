package hexlet.code.games;


import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static String trulyAnswer;
    public static String gameCondition = "What is the result of the expression?";
    public static String[][] calc() {
        var case1 = generate("-");
        var case2 = generate("+");
        var case3 = generate("*");
        String[][] cases = new String[][] {case1, case2, case3};
        return cases;
    }
    public static String[] generate(String sign) {
        var random = new Random();
        var randomNum1 = random.nextInt(20);
        var randomNum2 = random.nextInt(20);

        if (sign.equals("+")) {
            trulyAnswer = Integer.toString(randomNum1 + randomNum2);
        }
        if (sign.equals("-")) {
            trulyAnswer = Integer.toString(randomNum1 - randomNum2);
        }
        if (sign.equals("*")) {
            trulyAnswer = Integer.toString(randomNum1 * randomNum2);
        }
        var gameCondition = Integer.toString(randomNum1) + " " + sign + " " + Integer.toString(randomNum2);
        String[] result = new String[] {gameCondition, trulyAnswer};
        return result;
    }
}
