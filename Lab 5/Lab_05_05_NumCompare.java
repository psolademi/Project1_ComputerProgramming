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
            //Enter the forst number
            System.out.print("Enter b: ");
            b = sc.nextInt();
            if(a == b)
                //If the two numbers are equal, return indicates
                System.out.println("Indicates");
            else
                //If they are not, return not indicates
                System.out.println("Not indicates");
        }
        catch(Exception e)
        {
            //Return a try again for them to enter another number
            System.out.println("Please enter a number... Try Again");
        }
    }
}
