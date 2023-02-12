import java.util.Scanner;
public class Lab_05_02_BirthMonth {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int month;
        System.out.print("Enter birth month: ");
        month = sc.nextInt();
        if((month >=1 ) && (month <=12))
            System.out.println("Your birth month is: "+month);
        else
            System.out.println("You entered an incorrect month value: "+month);
    }
}
