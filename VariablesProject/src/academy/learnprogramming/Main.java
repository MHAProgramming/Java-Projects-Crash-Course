package academy.learnprogramming;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        // Inserted the Int Variables here
        int firstNumber = 2;
        int secondNumber = 5;

        // Inserted the Var variable here
        var subtraction = 7;
        int answer;
        String prompt = ". Press Enter when Ready";

        // This is where the system will print out the line listed in the "" marks
        System.out.println("Think of a number between 1 and 10. " + prompt);
        // Scanner Next Line will move the cursor to the next line for input
        scanner.nextLine();
        System.out.println("Multiply your number by " + firstNumber + prompt);
        scanner.nextLine();
        System.out.println("Now multiply the result by " + secondNumber + prompt);
        scanner.nextLine();
        System.out.println("Divide the result by the number you originally thought of " + prompt);
        scanner.nextLine();
        System.out.println("Now subtract " + subtraction + prompt);
        scanner.nextLine();

        answer = firstNumber * secondNumber - subtraction;
        System.out.println("The answer is " + answer);


        scanner.close();
    }
}
