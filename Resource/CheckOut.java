package Resource;

import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ask want to continue shopping
        boolean shop_more = SafeInput.getYNConfirm(in, "Wants to continue Shopping");
        double sumOfItems = 0;
        while (shop_more) {
            // Enter price
            double price = SafeInput.getRangedDouble(in, "Enter price", 0.50, 9.99);
            sumOfItems += price;
            // Ask if the user wants to continue shopping
            shop_more = SafeInput.getYNConfirm(in, "Wants to continue Shopping");
        }

        // Print total cost
        System.out.printf("Total cost :%.2f", sumOfItems);

    }
}
