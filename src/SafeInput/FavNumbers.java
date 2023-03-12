package Resource;

import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // To Enter the user's favorite number
        int favourite_int = SafeInput.getInt(in, "Enter your favorite integer");
        // To enter the user's favorite double
        double favourite_Double = SafeInput.getDouble(in, "Enter your favorite double");
        // Print favorite number
        System.out.println("Your favorite Integer recieved: " + favourite_int);
        // Print favorite double
        System.out.println("Your favorite Double recieved: " + favourite_Double);

    }
}
