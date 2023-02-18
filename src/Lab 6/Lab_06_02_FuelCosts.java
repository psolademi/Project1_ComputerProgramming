import java.util.Scanner;
public class Lab_06_02_FuelCosts {
    public static void main(String[] args) {
        // To create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of gallons of gas in the tank
        System.out.print("Enter number of gallons of gas in the tank: ");
        // Check if the input is a valid double value
        if (!scanner.hasNextDouble()) {
            // If not, print an error message and terminate the program
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }
        // If the input is valid, read it as a double
        double gallons = scanner.nextDouble();

        // Prompt the user to enter the fuel efficiency in miles per gallon
        System.out.print("Enter fuel efficiency in miles per gallon: ");
        // Check if the input is a valid double value
        if (!scanner.hasNextDouble()) {
            // If not, print an error message and terminate the program
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }
        // If the input is valid, read it as a double
        double mpg = scanner.nextDouble();

        // Prompt the user to enter the price of gas per gallon
        System.out.print("Enter price of gas per gallon: ");
        // Check if the input is a valid double value
        if (!scanner.hasNextDouble()) {
            // If not, print an error message and terminate the program
            System.out.println("Invalid input! Please enter a valid number.");
            return;
        }
        // If the input is valid, read it as a double
        double price = scanner.nextDouble();

        // Calculate the cost per mile, cost per 100 miles, and distance that can be traveled with the gas in the tank
        double costPerMile = price / mpg;
        double costPer100Miles = costPerMile * 100;
        double distance = gallons * mpg;

        // Display the results to the user using printf statements with appropriate formatting
        System.out.printf("Cost per 100 miles: $%.2f%n", costPer100Miles);
        System.out.printf("Distance with gas in the tank: %.0f miles%n", distance);
    }
}
