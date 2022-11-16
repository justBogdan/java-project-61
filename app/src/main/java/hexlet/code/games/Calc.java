package hexlet.code.games;

import java.util.Random;

public class Calc {
     static final int UPPER_BOARD = 20;
    private static String trulyAnswer;
    public static String[][] calc() {
        var case1 = generate("-");
        var case2 = generate("+");
        var case3 = generate("*");
        String[][] cases = new String[][] {case1, case2, case3};
        return cases;
    }
    public static String[] generate(String sign) {
        var random = new Random();
        var randomNum1 = random.nextInt(UPPER_BOARD);
        var randomNum2 = random.nextInt(UPPER_BOARD);

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
