import java.util.Scanner;

public class Lab_04_02_YearlyMaintenanceCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter maintenance cost of season 1: ");
        double s1 = in.nextDouble();
        System.out.print("Enter maintenance cost of season 2: ");
        double s2 = in.nextDouble();
        System.out.print("Enter maintenance cost of season 3: ");
        double s3 = in.nextDouble();
        System.out.print("Enter maintenance cost of season 4: ");
        double s4 = in.nextDouble();
        System.out.println("Maintenance details");
        System.out.printf("Season 1: $%.2f\n", s1);
        System.out.printf("Season 2: $%.2f\n", s2);
        System.out.printf("Season 3: $%.2f\n", s3);
        System.out.printf("Season 4: $%.2f\n", s4);
        System.out.printf("Yearly: $%.2f\n", s1+s2+s3+s4);
    }
}
