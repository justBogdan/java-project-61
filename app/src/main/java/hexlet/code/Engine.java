package hexlet.code;

import java.util.Scanner;
import hexlet.code.Even;
public class Engine {
    public static String username;
    public static void init(int gameNumber, String trulyAnswer, String gameGreeting) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        username = scanner.next();
        System.out.println(String.format("Hello, %s!", username));
        System.out.println(gameGreeting);
        for (var i = 1; i <= 3; i++) {
            Scanner scanner1 = new Scanner(System.in);
            if (gameNumber == 2) {
                var gameLogic = Even.even();
                System.out.println(String.format("Question: %s ", gameLogic));
            }
            System.out.print("Your answer: ");
            String userAnswer = scanner1.next();
            if (userAnswer.equals(trulyAnswer)) {
                System.out.println("Correct!");
            } else {
                var message = String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", userAnswer, trulyAnswer, username);
                System.out.println(message);
                return;
            }

            if (i == 3) {
                System.out.println(String.format("Congratulations, %s!", username));
            }
        }
    }
}
