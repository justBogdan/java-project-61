package hexlet.code;


import java.util.Scanner;
import java.util.Random;

public class Calc {
    public static String trulyAnswer;
    public static String gameCondition;
    public static String calc() {
        String[] signs = {"+", "-", "*"};
        var random = new Random();
        var randomIndex = random.nextInt(3);
        var sign = signs[randomIndex];
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
        return gameCondition = Integer.toString(randomNum1) + " " + sign + " " + Integer.toString(randomNum2);
    }
}
