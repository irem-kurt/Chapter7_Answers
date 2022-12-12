import java.util.Scanner;

public class NumberOfEvenAndOddNumbers7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] array = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt();
        }
        int countOfEven = printCountOfEvenAndOddNumbers(array);
        System.out.println("Number of even numbers: "+ countOfEven);
        System.out.println("Number of odd numbers: "+ (array.length-countOfEven));
    }
    public static int printCountOfEvenAndOddNumbers(int[] arrayOfNumbers){
        int even=0;
        int odd =0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if(arrayOfNumbers[i] % 2 ==0){
                even++;
            }
            else
                odd++;
        }
        //System.out.printf("\nNumber of even elements in the array: %d", even);
        //System.out.printf("\nNumber of odd elements in the array: %d", odd);
        return even;
    }

}
