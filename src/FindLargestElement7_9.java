// Write a method that finds the largest element in an array
//of double values
import java.util.Scanner;
public class FindLargestElement7_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double [] numbers = new double[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextDouble();
        }
        System.out.println(findMax(numbers));
    }
    public static double findMax(double[] array) {
        double max = array[0];	// The max value
        for (double i: array) {
            if (i > max)
                max = i;
        }
        return max;
    }
}
