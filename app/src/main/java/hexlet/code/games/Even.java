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
        var truAnswer01 = case1 % 2 == 0 ? "yes" : "no";
        var truAnswer11 = case2 % 2 == 0 ? "yes" : "no";
        var truAnswer21 = case3 % 2 == 0 ? "yes" : "no";

        var newCase1 = Integer.toString(case1);
        var newCase2 = Integer.toString(case2);
        var newCase3 = Integer.toString(case3);

        String[][] cases = {{newCase1, truAnswer01}, {newCase2, truAnswer11}, {newCase3, truAnswer21}};
        return cases;
    }
}
