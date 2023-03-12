package Resource;

import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        // Enter Social Security Number
        String ssn = SafeInput.getRegExString(pipe, "Enter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        // Print SSn received
        System.out.println("SSN recieved:" + ssn);

        // Enter UC ID
        String ucStudentMNo = SafeInput.getRegExString(pipe, "Enter your UC student M number", "(M|m)\\d{5}");
        // Print ID received
        System.out.println("UC student M number recieved:" + ucStudentMNo);

        // Enter menu choice
        String menuChoice = SafeInput.getRegExString(pipe, "Enter your menu choice", "[OoSsVvQq]");
        // Receive menu choice
        System.out.println("Menu choice recieved:" + menuChoice);

    }
}
