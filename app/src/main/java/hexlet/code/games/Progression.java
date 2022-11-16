package hexlet.code.games;

import java.util.Random;
import java.util.Arrays;

public class Progression {
    public static String[][] progression () {

        var random = new Random();
        var upperBoard = 10;
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
        var random = new Random(1);
        var randomStep = random.nextInt(4);
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
        return random.nextInt(5) + 5;
    }
}
