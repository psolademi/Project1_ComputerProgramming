import java.util.Scanner;
public class Lab_05_05_NumCompare {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0;
        try {
            System.out.print("Enter a: ");
            a = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter b: ");
            b = sc.nextInt();
            if(a == b)
                System.out.println("Indicates");
            else
                System.out.println("Not indicates");
        }
        catch(Exception e)
        {
            System.out.println("Please enter a number... Try Again");
        }
    }
}
