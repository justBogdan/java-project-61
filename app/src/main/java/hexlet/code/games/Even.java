package hexlet.code.games;

import java.util.Random;
public class Even {
    static final int UPPER_BOARD = 20;
    public static String[][] even() {
            var gameQuestion = random();
            return gameQuestion;
    }

    public static String[][] random() {
        var ran = new Random();
        var case1 = ran.nextInt(UPPER_BOARD);
        var case2 = ran.nextInt(UPPER_BOARD);
        var case3 = ran.nextInt(UPPER_BOARD);
        var trulyAnswer01 = case1 % 2 == 0 ? "yes" : "no";
        var trulyAnswer11 = case2 % 2 == 0 ? "yes" : "no";
        var trulyAnswer21 = case3 % 2 == 0 ? "yes" : "no";
        String[][] cases = {{Integer.toString(case1),trulyAnswer01}, {Integer.toString(case2), trulyAnswer11}, {Integer.toString(case3), trulyAnswer21}};
        return cases;
    }
}
