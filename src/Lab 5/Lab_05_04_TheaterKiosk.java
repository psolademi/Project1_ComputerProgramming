import java.util.Scanner;
public class Lab_05_04_TheaterKiosk {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age;
        System.out.print("Enter age: ");
        age = sc.nextInt();
        if(age >= 21)
            System.out.println("Got a paper wrist band");
    }
}
