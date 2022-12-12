//Write a program that reads 11 integers, compares each
//integer with the 11th integer, and displays whether the integers are “greater”,
//“smaller”, or “equal” to the 11th integer.

import java.util.Scanner;

public class AskTHISComparingNumbersWithLastInteger {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[11];
        System.out.print("Enter eleven integers: ");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }
        CompareIntWithLastInt(numbers);

    }

    public static void CompareIntWithLastInt(int[] array){

        for (int i=0; i < array.length-1; i++){
            int lastItem = array[array.length-1];
            if (lastItem > array[i]){
                System.out.println("Integer is smaller");
            } else if (lastItem < array[i]) {
                System.out.println("Integer is greater");
            }
            if (lastItem == array[i]){
                System.out.println("Integer is equal to " + lastItem);
            }
        }
    }
}
//10 9 8 7 6 5 4 3 2 1 0
//1 2 3 4 5 6 7 8 9 10 11