package hexlet.code.games;

import java.util.Random;

public class Progression {
    static final int UPPER_BOARD = 10;
    static final int INIT_SEED = 1;
    static final int UPPER_BOARD_OF_STEP = 4;
    static final int FRONTIER_OF_LENGTH = 5;
    static final int BOUND_OF_LENGTH = 5;
    public static String[][] progression () {
        var random = new Random();
        var randomStart1 = random.nextInt(UPPER_BOARD);
        var randomStart2 = random.nextInt(UPPER_BOARD);
        var randomStart3 = random.nextInt(UPPER_BOARD);

        var case1 = generateProgression(randomStart1, generateLength());
        var case2 = generateProgression(randomStart2, generateLength());
        var case3 = generateProgression(randomStart3, generateLength());

        String[][] result = new String[][] {blur(case1), blur(case2), blur(case3)};
        return result;
}
    public static String[] generateProgression (int start, int lengthOfProgression) {
        var random = new Random(INIT_SEED);
        var randomStep = random.nextInt(UPPER_BOARD_OF_STEP);
        String[] progression = new String[lengthOfProgression];
        for (var i = 0; i < lengthOfProgression; i++) {
            progression[i] = Integer.toString(start);
            start += randomStep;
        }
        return progression;
    }

    public static String[] blur (String[] progression) {
        var random = new Random();
        var randomIndex = random.nextInt(progression.length - 1);
        var copyOfProgression = progression.clone();
        var trulyAnswer = copyOfProgression[randomIndex];
        copyOfProgression[randomIndex] = "..";
        String[] result = new String[] {String.join(" ", copyOfProgression), trulyAnswer};
        return result;
    }

    public static int generateLength () {
        var random = new Random();
        return random.nextInt(BOUND_OF_LENGTH) + FRONTIER_OF_LENGTH;
    }
}
