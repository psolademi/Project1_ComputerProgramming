import java.util.Scanner;
public class Lab_05_03_PartyAffiliation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("(D) Democratic");
        System.out.println("(R) Republican");
        System.out.println("(I) Independent");
        System.out.println("(O) Other");
        System.out.print("Enter your choice(D/R/I/O): ");
        String choice = sc.next();
        if(choice.equals("D"))
            System.out.println("You get a Democratic Donkey.");
        else if(choice.equals("R"))
            System.out.println("You get a Republican Elephant.");
        else if(choice.equals("I"))
            System.out.println("You get a Independent Person.");
        else
            System.out.println("You get other");
    }
}
