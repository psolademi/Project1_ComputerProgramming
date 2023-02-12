import java.util.Scanner;
public class Lab_05_01_ShipCostCalculator {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double shipping=0.0;
        System.out.print("Item price: $");
        double price = sc.nextDouble();
        if(price < 100)
            shipping = 0.02 * price;
        double totalCost = shipping + price;
        if(shipping == 0)
            System.out.println("Shipping is free");
        else
            System.out.println("Shipping Cost is: $"+shipping);
        System.out.println("Total Cost is: $"+totalCost);
    }
}
