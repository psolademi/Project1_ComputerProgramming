import java.util.Scanner;
import java.util.Random;
public class Lab_06_05_HighorLow {
    public static void main(String[] args) {
        // Generate a random number between 1 and 10 inclusive
        Random random = new Random();
        int number = random.nextInt(10) + 1;

        // Ask the user to guess the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 10: ");
        int guess = scanner.nextInt();

        // Display the random number and whether the guess was high, low, or correct
        System.out.println("The number was " + number);
        if (guess == number) {
            System.out.println("You guessed it! Great job!");
        } else if (guess < number) {
            System.out.println("Your guess was too low.");
        } else {
            System.out.println("Your guess was too high.");
        }
    }
}
