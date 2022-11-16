package hexlet.code.games;

import java.util.Random;
import java.util.Arrays;

public class Progression {
    private static int upperBoard = 10;
    private static int initSeed = 1;
    private static int upperBoardOfStep = 4;
    private static int frontierOfLength = 5;
    private static int boundOfLength = 5;
    public static String[][] progression () {

        var random = new Random();
        var randomStart1 = random.nextInt(upperBoard);
        var randomStart2 = random.nextInt(upperBoard);
        var randomStart3 = random.nextInt(upperBoard);

        var case1 = generateProgression(randomStart1, generateLength());
        var case2 = generateProgression(randomStart2, generateLength());
        var case3 = generateProgression(randomStart3, generateLength());

        String[][] result = new String[][] {blur(case1), blur(case2), blur(case3)};
        return result;
}
    public static String[] generateProgression (int start, int lengthOfProgression) {
        var random = new Random(initSeed);
        var randomStep = random.nextInt(upperBoardOfStep);
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

    public static int generateLength() {
        var random = new Random();
        return random.nextInt(boundOfLength) + frontierOfLength;
    }
}
