package Resource;

import java.util.Scanner;
public class SafeInput {
    public static String getNonZeroLenString(Scanner in, String input) {
        System.out.print(input + ": ");
        String User_Input = in.nextLine();
        while (User_Input.length() == 0) {
            User_Input = in.nextLine();
        }
        return User_Input;
    }

    public static int getInt(Scanner in, String input) {

        do {
            System.out.print(input + ": ");
            if (in.hasNextInt()) {
                int value = in.nextInt();
                if (in.hasNextLine())
                    in.nextLine();
                return value;
            }
        } while (true);

    }

    public static double getDouble(Scanner in, String input) {

        do {
            System.out.print(input + ": ");
            if (in.hasNextDouble()) {
                double value = in.nextDouble();
                if (in.hasNextLine())
                    in.nextLine();
                return value;
            }
        } while (true);

    }

    public static int getRangedInt(Scanner in, String input, int low, int high) {
        do {
            System.out.print(input + " [" + low + "-" + high + "] " + ": ");
            if (in.hasNextInt()) {
                int value = in.nextInt();
                if (in.hasNextLine())
                    in.nextLine();
                if (value >= low && value <= high)
                    return value;
            }
        } while (true);
    }

    public static double getRangedDouble(Scanner in, String input, double low, double high) {
        do {
            System.out.print(input + " [" + low + "-" + high + "] " + ": ");
            if (in.hasNextDouble()) {
                double value = in.nextDouble();
                if (in.hasNextLine())
                    in.nextLine();
                if (value >= low && value <= high)
                    return value;
            }
        } while (true);
    }

    public static boolean getYNConfirm(Scanner in, String input) {
        String User_input = "";
        do {
            System.out.print(input + ": ");
            if (in.hasNextLine())
                User_input = in.nextLine();

        } while (User_input == null || (User_input.trim().length() == 1
                && !(User_input.trim().equalsIgnoreCase("y") || User_input.trim().equalsIgnoreCase("n"))));

        if (User_input.trim().equalsIgnoreCase("y"))
            return true;
        else
            return false;
    }

    public static String getRegExString(Scanner in, String input, String regEx) {
        String User_input = "";
        do {
            System.out.print(input + ": ");
            if (in.hasNextLine())
                User_input = in.nextLine();

        } while (User_input == null || !User_input.matches(regEx));

        return User_input;

    }

    public static void prettyHeader(String msg) {
        int stars = 60;
        while (stars-- > 0) {
            System.out.print("*");
        }
        System.out.println();
        int div = (60 - msg.length()) / 2;
        int left = 1;
        while (left <= div) {
            System.out.print("*");
            left++;
        }
        System.out.print(msg);
        int right = 0;
        if (msg.length() % 2 == 0)
            right = 1;
        while (right <= div) {
            System.out.print("*");
            right++;
        }
        System.out.println();
        stars = 60;
        while (stars-- > 0) {
            System.out.print("*");
        }
    }
}
