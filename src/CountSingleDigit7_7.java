import java.util.Arrays;

public class CountSingleDigit7_7 {
    public static void main(String[] args) {
        int[] array = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < 200; i++) {
            double number = Math.random()*10;
            int numberAsInt = (int) number;
            array[numberAsInt] = array[numberAsInt] + 1;
        }
        System.out.println(Arrays.toString(array));
    }
}
