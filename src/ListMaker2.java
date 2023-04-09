import java.util.ArrayList;
import java.util.Scanner;
public class ListMaker2 {
    private static ArrayList<String> itemList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            displayMenu();
            choice = getRegExString(scanner, "[AaDdPpQq]", "Invalid input. Please choose a valid option.");

            switch (choice.toLowerCase()) {
                case "a":
                    addItem(scanner);
                    break;
                case "d":
                    deleteItem(scanner);
                    break;
                case "p":
                    printList();
                    break;
                case "q":
                    if (getYNConfirm(scanner, "Are you sure you want to quit? (Y/N): ")) {
                        System.out.println("Exiting the program...");
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid input. Please choose a valid option.");
                    break;
            }
        } while (!choice.equalsIgnoreCase("q"));
    }

    private static void displayMenu() {
        System.out.println("=========================================");
        System.out.println("           LAB 11 LISTMAKER              ");
        System.out.println("=========================================");
        System.out.println("Options:");
        System.out.println("A - Add an item to the list");
        System.out.println("D - Delete an item from the list");
        System.out.println("P - Print the list");
        System.out.println("Q - Quit");
        System.out.println("=========================================");
    }

    private static void addItem(Scanner scanner) {
        // Stubbed out function for adding an item to the list
        System.out.println("Stubbed out function: addItem()");
    }

    private static void deleteItem(Scanner scanner) {
        // Stubbed out function for deleting an item from the list
        System.out.println("Stubbed out function: deleteItem()");
    }

    private static void printList() {
        // Stubbed out function for printing the list
        System.out.println("Stubbed out function: printList()");
    }

    private static String getRegExString(Scanner scanner, String pattern, String errorMessage) {
        // Stubbed out function for getting input with a regex pattern
        System.out.println("Stubbed out function: getRegExString()");
        return null;
    }

    private static int getRangedInt(Scanner scanner, int min, int max, String errorMessage) {
        // Stubbed out function for getting an integer within a range
        System.out.println("Stubbed out function: getRangedInt()");
        return 0;
    }

    private static boolean getYNConfirm(Scanner scanner, String prompt) {
        // Stubbed out function for getting a yes/no confirmation
        System.out.println("Stubbed out function: getYNConfirm()");
        return false;
    }
}
