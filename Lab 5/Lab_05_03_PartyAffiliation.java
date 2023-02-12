import java.util.Scanner;
public class Lab_05_03_PartyAffiliation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Adding inputs for each party affiliation
        System.out.println("(D) Democratic");
        System.out.println("(R) Republican");
        System.out.println("(I) Independent");
        System.out.println("(O) Other");
        // Asking the question for party affiliation
        System.out.print("Enter your choice(D/R/I/O): ");
        String choice = sc.next();
        if(choice.equals("D"))
            //If D, return You get Democratic Donkey
            System.out.println("You get a Democratic Donkey.");
        else if(choice.equals("R"))
            //If R, return You get Republican Elephant
            System.out.println("You get a Republican Elephant.");
        else if(choice.equals("I"))
            //And if I was entered, return You get Independent Person
            System.out.println("You get a Independent Person.");
        else
            System.out.println("You get other");
    }
}
