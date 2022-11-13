package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String username;
    public static void init(String[][] gameLogic,String gameGreeting) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        username = scanner.next();
        System.out.println(String.format("Hello, %s!", username));
        System.out.println(gameGreeting);
        for (var i = 0; i <= 2; i++) {

            Scanner scanner1 = new Scanner(System.in);
            System.out.println(String.format("Question: %s ", gameLogic[i][0]));
            System.out.print("Your answer: ");
            String userAnswer = scanner1.next();
            if (userAnswer.equals(gameLogic[i][1])) {
                System.out.println("Correct!");
            } else {
                var message = String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", userAnswer, gameLogic[i][1], username);
                System.out.println(message);
                return;
            }
            if (i == 2) {
                System.out.println(String.format("Congratulations, %s!", username));
            }
        }
    }
}
