import java.util.Scanner;
public class Lab_06_01_CtoFConverter {
    public static void main(String[] args)
    {
        float C,F;
        Scanner scan=new Scanner(System.in);
        // To take User's input
        System.out.println("Enter temperature in Celsius :");
        C=scan.nextInt();
// To test for the bad inputs
        if(C==0) {
            System.out.println("You have entered freezing point");}
        else if(C==100) {
            System.out.println("You have entered boiling point");}

        else //if the input is appropriate

        {
           // Conversion Formula
            F= C * 9/5 + 32;

            System.out.println("Equivalent Temperature in Fahrenheit: "+F);
        }
    }
}
