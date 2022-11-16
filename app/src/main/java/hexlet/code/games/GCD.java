package hexlet.code.games;

import java.util.Random;

public class GCD {
    public static String[][] gcd() {
     var random = new Random();
     var upperBoard = 100;
     var randomNum1 = random.nextInt(upperBoard);
     var randomNum2 = random.nextInt(upperBoard);
     var randomNum3 = random.nextInt(upperBoard);

     var case1 = format(randomNum1, randomNum2);
     var case2 = format(randomNum2, randomNum3);
     var case3 = format(randomNum3, randomNum1);

     var trulyAnswer01 = Integer.toString(findGcd(randomNum1, randomNum2));
     var trulyAnswer11 = Integer.toString(findGcd(randomNum2, randomNum3));
     var trulyAnswer21 = Integer.toString(findGcd(randomNum3, randomNum1));

     String[][] caseAndTrulyAnswer = new String[][] {{case1, trulyAnswer01}, {case2, trulyAnswer11}, {case3, trulyAnswer21}};

     return caseAndTrulyAnswer;
    }
    public static int findGcd(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return findGcd(b, a % b);
    }

    public static String format(int a, int b) {
        var trulyFormat = String.format("%s %s", a, b);
        return trulyFormat;
    }
}
