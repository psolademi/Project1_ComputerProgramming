import java.util.Scanner;
public class Lab_05_02_BirthMonth {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        // Integer Month
        int month;
        System.out.print("Enter birth month: ");
        month = sc.nextInt();
        // Selecting the birth month in the integers of 1-12
        if((month >=1 ) && (month <=12))
            // Print birth month
            System.out.println("Your birth month is: "+month);
        else
            // If an invalid birth month was answered, return incorrect month value
            System.out.println("You entered an incorrect month value: "+month);
    }
}
