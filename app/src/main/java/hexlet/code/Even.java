package hexlet.code;

import java.util.Random;
import java.util.Scanner;
import hexlet.code.Engine;
public final class Even {
    public static  boolean flag;
    public static String typeOfAnswer;
    public static String userAnswer;
    public static void even() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            var randomNumber = random();
            Scanner scanner = new Scanner(System.in);
            System.out.println(String.format("Question: %s", randomNumber));
            System.out.print("Your answer: ");
            userAnswer = scanner.next();

            if (randomNumber % 2 == 0 && userAnswer.equals("yes") || randomNumber % 2 != 0 && userAnswer.equals("no")) {
                flag = true;
            }
            if (randomNumber % 2 == 0 && userAnswer.equals("no") || randomNumber % 2 != 0 && userAnswer.equals("yes") || !userAnswer.equals("yes") && !userAnswer.equals("no")) {
                typeOfAnswer = userAnswer.equals("yes") ? "no" : "yes";
                flag = false;
            }
    }

    public static int random() {
        var ran = new Random();
        return ran.nextInt(20);
    }
}
