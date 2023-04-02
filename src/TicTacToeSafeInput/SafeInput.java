package TicTacToeSafeInput;

import java.util.Scanner;

public class SafeInput {
    /**
     * Gets a valid integer from user within the range
     * @param console
     * @param prompt
     * @param low
     * @param high
     * @return
     */
    public static int getRangedInt(Scanner console, String prompt, int low, int high) {
        int value = 0;
        boolean flag = false;

        while(!flag) {
            System.out.print(prompt);
            if(console.hasNextInt()) {
                value = console.nextInt();
                if(value < low || value > high) {
                    System.out.println("ERR: The input must be between " + low + " and " + high + ".");
                }
                else {
                    flag = true;
                }
                console.nextLine();
            }
            else {
                System.out.println("ERR: Invalid input, must be a number.");
                // Dispose all input in buffer, move to next line of buffer
                console.nextLine();
            }
        }

        return value;
    }

    /**
     * Gets a validated repsonse from the user from a yes or no question
     * @param console
     * @param prompt
     * @return
     */
    public static boolean getYNConfirm(Scanner console, String prompt) {
        String input = "";
        boolean flag = false;

        while(!flag) {
            System.out.print(prompt);
            input = console.nextLine().toLowerCase();

            if(!input.equals("y") && !input.equals("yes") && !input.equals("n") && !input.equals("no")) {
                System.out.println("ERR: Please enter only 'y', 'n', 'yes', or 'no' as response.");
            }
            else {
                flag = true;
            }
        }

        return input.equals(("y")) || input.equals("yes");
    }

}