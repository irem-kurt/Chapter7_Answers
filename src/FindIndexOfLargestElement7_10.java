public class FindIndexOfLargestElement7_10 {

    public static void main(String[] args) {
        int[] array = {1, 2, 11, 5, 7, 8, 10};
        System.out.println(String.valueOf(findIndex(array)));
    }

    public static int findIndex(int[] array) {
        int maxInteger = 0;
        int index = 0;
        for(int i=0; i<array.length; i++) {
            if (array[i] == maxInteger) {
                index = i;
            } else if(array[i] > maxInteger){
                maxInteger = array[i];
                index = i;
            }
        }
        return index;
    }
}
