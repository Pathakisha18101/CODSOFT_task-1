/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codsoft_q1;

import java.util.Random;
import java.util.Scanner;

public class codsoft_q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int numberOfRounds = 1;
        int maxAttempts = 5;
        System.out.println("____________Codsoft Task 1_________________");
        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("Guess the Number Game");
            System.out.println("-----------------------------------");
            System.out.println("Round: " + (numberOfRounds ));
            System.out.println("Enter your guess between 1 and 100:");

            int generatedNumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean correctGuess = false;

            while (!correctGuess && attempts < maxAttempts) {
                attempts++;
                int userGuess = scanner.nextInt();

                if (userGuess < generatedNumber) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > generatedNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    correctGuess = true;
                    score++;
                    System.out.println("Congratulations! You guessed the number correctly.");
                }
            }

            if (attempts == maxAttempts && !correctGuess) {

                System.out.println("Sorry, you didn't guess the number correctly within the allowed attempts.");
                System.out.println("The correct number was: " + generatedNumber);
            }
            else
            {
                System.out.println("The correct number was: " + generatedNumber);
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }

            numberOfRounds++;
            score = 0;
        }

        //System.out.println("Your final score: " + (numberOfRounds * maxAttempts - score) + " out of " + (numberOfRounds * maxAttempts));
        System.out.println("Your final score: " + (score) + " out of " + (numberOfRounds + 1));
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}