//importing scanner
import java.util.Scanner;
public class Lab_05_01_ShipCostCalculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double shipping=0.0;
        System.out.print("Item price: $");
        double price = sc.nextDouble();
        // Calculating the shipping fee if the price is less than $100
        if(price < 100)
            shipping = 0.02 * price;
        // Cost of the item + shipping
        double totalCost = shipping + price;
        // But if the shipping is greater than 100, return, "shipping is free"
        if(shipping == 0)
            System.out.println("Shipping is free");
        else
            // Print the total price.
            System.out.println("Shipping Cost is: $"+shipping);
        System.out.println("Total Cost is: $"+totalCost);
    }
}
