package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String username;
    private static int counterOfTrueAnswers = 0;
    static final int COUNTER_FOR_CONGRATULATIONS = 3;
    public static void init(String[][] gameLogic, String gameGreeting) {
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
                counterOfTrueAnswers += 1;
                System.out.println("Correct!");
            } else {
                var message = String.format("'%s' is wrong answer ;(. Correct answer was '%s'.", userAnswer, gameLogic[i][1]);
                System.out.println(message);
                System.out.println(String.format("Let's try again, %s!", username));
                return;
            }
            if (counterOfTrueAnswers == COUNTER_FOR_CONGRATULATIONS) {
                System.out.println(String.format("Congratulations, %s!", username));
            }
        }
    }
}
