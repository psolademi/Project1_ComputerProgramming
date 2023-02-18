import java.util.Scanner;
public class Lab_06_04_MetricConverter {
    public static void main(String[] args) {
        double meters, miles, feet, inches;
        final double MILES_PER_METER = 0.000621371;
        final double FEET_PER_METER = 3.28084;
        final double INCHES_PER_METER = 39.3701;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a measurement in meters: ");

        // Check for valid input
        if (input.hasNextDouble()) {
            meters = input.nextDouble();

            // Perform conversions
            miles = meters * MILES_PER_METER;
            feet = meters * FEET_PER_METER;
            inches = meters * INCHES_PER_METER;

            // Output results
            System.out.println(meters + " meters is equal to:");
            System.out.println(miles + " miles");
            System.out.println(feet + " feet");
            System.out.println(inches + " inches");
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}
