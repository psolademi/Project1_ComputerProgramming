import java.util.Scanner;
public class Lab_05_04_TheaterKiosk {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        //Entet the age integer
        int age;
        //Print and ask for their age
        System.out.print("Enter age: ");
        age = sc.nextInt();
        //If greater than 21
        if(age >= 21)
            //If gretaer than 21, return, they got a paper wrist band
            System.out.println("Got a paper wrist band");
    }
}
