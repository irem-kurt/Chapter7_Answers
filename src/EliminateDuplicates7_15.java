import java.util.Arrays;
import java.util.Scanner;

/**
 * 7.15 (Eliminate duplicates) Write a method that returns
 * a new array by eliminating
 * the duplicate values in the
 * array using the following method header:
 * Write a test program that reads in ten integers, invokes the method,
 * and displays the numbers separated by exactly one space.
 */
public class EliminateDuplicates7_15 {
    public static int[] eliminateDuplicates(int[] initialList) {
        int[] finalList = new int[initialList.length];
        int currentIndexOfFinalArray = 0;

        for (int i = 0; i < initialList.length; i++) {
/*
            int finalI = i;
            if (!IntStream.of(list2).anyMatch(x -> x == list[finalI])) {
                list2[currentIndexOfFinalArray] = list[i];
                currentIndexOfFinalArray += 1;
            }
*/
            boolean finalListHasNumber = false;
            for (int k = 0; k < i; k++) {
                if (finalList[k] == initialList[i]) {
                    finalListHasNumber = true;
                    break;
                }
            }
            if (!finalListHasNumber) {
                finalList[currentIndexOfFinalArray++] = initialList[i];
            }
        }
        int[] finishedArray = new int[currentIndexOfFinalArray];
        for (int i = 0; i < currentIndexOfFinalArray; i++) {
            finishedArray[i] = finalList[i];
        }
        return finishedArray;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];

        System.out.println("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        int[] finishedArray = eliminateDuplicates(list);
        System.out.println("The number of distinct integers is: " + finishedArray.length);
        System.out.println("The distinct integers are: ");

        for (int i = 0; i < finishedArray.length; i++) {
            System.out.println(finishedArray[i] + " ");
        }
        input.close();
    }
}