import java.util.Random;
public class Lab_09_Array {

        public static void main(String args[])
        {
            // Create random object
            Random ran = new Random();

            // Declares an int array of dataPoints.
            int[] dataPoints = new int[100];

            // Initialize each element of array dataPoints to random value between 1 to 100.
            for (int i = 0; i < dataPoints.length; i++)
                dataPoints[i] = ran.nextInt(100) + 1;

            // Loop that displays dataPoint values
            for (int i = 0; i < dataPoints.length; i++)
                System.out.print(dataPoints[i] + " | ");
        }
}