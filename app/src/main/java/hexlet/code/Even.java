package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void even() {
        var username = Greeting.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (var i = 1; i <= 3; i++) {
            var randomNumber = random();
            Scanner scanner = new Scanner(System.in);
            System.out.println(String.format("Question: %s", randomNumber));
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (!answer.equals("yes") && !answer.equals("no")){
                var trueAnswer = randomNumber % 2 == 0 ? "yes" : "no";
                System.out.println(String.format("'%s'  is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", answer, trueAnswer, username));
                break;
            }

            if (randomNumber % 2 == 0 && answer.equals("yes")) {
                System.out.println("Correct!");
            }
            if (randomNumber % 2 != 0 && answer.equals("no")) {
                System.out.println("Correct!");
            }
            if (randomNumber % 2 == 0 && answer.equals("no") || randomNumber % 2 != 0 && answer.equals("yes")) {
                var yesOrNo = answer.equals("yes") ? "no" : "yes";
                System.out.println(String.format("'%s'  is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", answer, yesOrNo, username));
                break;
            }
            if (i == 3) {
                System.out.println(String.format("Congratulations, %s!", username));
            }
        }
    }

    public static int random() {
        var ran = new Random();
        return ran.nextInt(20);
    }
}
