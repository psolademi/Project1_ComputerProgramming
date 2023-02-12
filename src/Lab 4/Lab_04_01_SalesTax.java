import java.util.Scanner;
public class Lab_04_01_SalesTax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter price of purchase: $");
        double price = in.nextDouble();
        double tax = price * 0.05;
        System.out.printf("Sales tax is $%.2f\n", tax);
    }
}
