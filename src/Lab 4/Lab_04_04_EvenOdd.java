public class Lab_04_04_EvenOdd {
    static void isOddOrEven(int x) {
        if(x%2 == 0) {
            System.out.println(x+" is Even");
        } else {
            System.out.println(x+" is Odd");
        }
    }

    public static void main(String[] args) {
        int numToExamine = 3;
        isOddOrEven(numToExamine);
    }

}