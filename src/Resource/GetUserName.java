package Resource;

import java.util.Scanner;
public class GetUserName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        // Enter first name
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        // Enter last name
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        // Print full name
        System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}
