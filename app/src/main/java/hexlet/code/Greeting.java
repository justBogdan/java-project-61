package hexlet.code;

import java.util.Scanner;

 public class Greeting {
     public static String greet() {
      Scanner scanner = new Scanner(System.in);
         System.out.println("Welcome to the Brain Games!");
         System.out.print("May I have your name? ");
         String username = scanner.next();
         System.out.println(String.format("Hello, %s!", username));
         return username;
     }
}
