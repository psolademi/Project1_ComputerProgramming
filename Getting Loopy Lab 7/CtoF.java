import java.util.Scanner;
public class CtoF {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit;
        do {
            // Ask for the temperature in Celsius
            System.out.print("Enter a temperature in Celsius: ");
            while (!input.hasNextDouble())
            {
                // consume the invalid input
                System.out.println("Error: Invalid input. Please enter a valid number.");

                input.next();
            }
            celsius = input.nextDouble();
            if (celsius < -273.15)
            {
                // Return error message
                System.out.println("Error: Temperature cannot be below absolute zero (-273.15C).");
            }
        }
        while (celsius < -273.15);

        fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("%.2fC = %.2fF", celsius, fahrenheit);
    }
}
