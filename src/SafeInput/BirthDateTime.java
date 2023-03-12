package Resource;

import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Enter your year of birth
        int year = SafeInput.getRangedInt(in, "Enter your year of birth", 1950, 2010);
        // Print your year of birth
        System.out.println("Birth Year you Entered is :-" + year);
        // Enter your month of birth
        int month = SafeInput.getRangedInt(in, "Enter your month of birth", 1, 12);
        System.out.println("Month you entered is :- " + month);
        int day = 0;
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, 31);
                break;
            case 2:
                day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, 29);
                break;
            default:
                day = SafeInput.getRangedInt(in, "Enter your day of birth", 1, 30);
                break;

        }
        // Print day of birth
        System.out.println("Day you entered is :-" + day);
        // Enter hour of birth
        int hour = SafeInput.getRangedInt(in, "Enter your hour of birth", 1, 24);
        // Print hour of birth
        System.out.println("Hour you entered is :-" + hour);
        // Enter minute of birth
        int minute = SafeInput.getRangedInt(in, "Enter your minute of birth", 1, 59);
        // Print minute of birth
        System.out.println("Minute you entered is :-:" + minute);
        // Print the entire result
        System.out.println("Your BithDate Time is:-" + day + "/" + month + "/" + year + " " + hour + ":" + minute);
    }
}
