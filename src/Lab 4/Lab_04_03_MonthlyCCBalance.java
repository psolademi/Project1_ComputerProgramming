public class Lab_04_03_MonthlyCCBalance {
    public static void main(String[] args) {
        double balance = 5000;
        double interest = balance * 0.17;
        System.out.printf("Interest after 1 month is $%.2f\n", interest);
        balance += interest;
        System.out.printf("Interest after 2 months is $%.2f\n", interest+balance*0.17);
    }
}
