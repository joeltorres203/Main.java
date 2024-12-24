import java.util.Scanner;  // Import the Scanner class for user input
import java.util.Random;   // Import the Random class to generate random numbers

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create a Random object to generate a random number
        Random random = new Random();

        // Generate a random number between 1 and 100
        int numberToGuess = random.nextInt(100) + 1;
        int userGuess = 0;  // Initialize the user's guess to 0

        // Display the game instructions
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");

        // While the user has not guessed the correct number
        while (userGuess != numberToGuess) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();  // Get the user's guess

            // Check if the guess is too low, too high, or correct
            if (userGuess < numberToGuess) {
                System.out.println("Too low!");
            } else if (userGuess > numberToGuess) {
                System.out.println("Too high!");
            } else {
                System.out.println("Correct! You guessed the right number!");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
