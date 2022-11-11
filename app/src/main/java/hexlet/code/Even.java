package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
public class Even {
    public static String trulyAnswer = even() % 2 == 0 ? "yes" : "no";
    public static String gameCondition = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static int even() {
            var gameQuestion = random();
            return gameQuestion;

    }

    public static int random() {
        var ran = new Random();
        return ran.nextInt(20);
    }
}
