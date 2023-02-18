import java.util.Scanner;
public class Lab_06_04_MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the lengths of the sides of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = getPositiveDouble(scanner);
        System.out.print("Enter the width of the rectangle: ");
        double width = getPositiveDouble(scanner);

        // Calculate the area and perimeter of the rectangle
        double area = length * width;
        double perimeter = 2 * (length + width);

        // Calculate the length of the diagonal using the Pythagorean theorem
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));

        // Print the results
        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);
        System.out.println("The length of the diagonal is: " + diagonal);
    }

    // Helper method to get a positive double from the user
    private static double getPositiveDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double num = scanner.nextDouble();
                if (num > 0) {
                    return num;
                }
            }
            System.out.print("Invalid input. Please enter a positive number: ");
            scanner.next();
        }
    }
}
