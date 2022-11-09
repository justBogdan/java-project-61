package hexlet.code;

import java.util.Scanner;
import  hexlet.code.Even;
public class Engine {
    public static String username;

    public static final void Start(int game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        username = scanner.next();
        System.out.println(String.format("Hello, %s!", username));
        for (var i = 1; i <= 3; i++) {
            switch (game) {
                case 1:
                    break;
                case 2:
                    Even.even();
                    break;
            }
            if (Even.flag) {
                System.out.println("Correct!");
            }

            if (!Even.flag) {
                var trueAnswer = Even.typeOfAnswer;
                var userAnswer = Even.userAnswer;
                var output = String.format("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!", userAnswer, trueAnswer, username);
                System.out.println(output);
                break;
            }

            if (i == 3) {
                var congMessage = String.format("Congratulations, %s!", username);
                System.out.println(congMessage);
            }
            }
        }
    }
