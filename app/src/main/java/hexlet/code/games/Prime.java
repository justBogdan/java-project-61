package hexlet.code.games;

import java.util.Random;

public class Prime {
    public static String[][] prime() {
        var min = 1;
        var max = 30;
        var case1 = Integer.toString(generate(min, max));
        var case2 = Integer.toString(generate(min, max));
        var case3 = Integer.toString(generate(min, max));
        String[][] result = new String[][]{{case1, isPrime(case1)}, {case2, isPrime(case2)}, {case3, isPrime(case3)}};
        return result;
    }
    public static String isPrime(String num) {
        var acc = 0;
        var divider = 1;
        var numToInt = Integer.parseInt(num);
        if (numToInt == 1) {
            return "yes";
        }
        for (var i = 0; i < numToInt; i++) {
            if (numToInt % divider == 0) {
                acc++;
            }
            divider++;
        }
        return acc == 2 ? "yes" : "no";
    }
    public static int generate(int min, int max) {
        var random = new Random();

        return random.nextInt(max - min) + min;
    }
}
