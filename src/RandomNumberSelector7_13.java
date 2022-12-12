public class RandomNumberSelector7_13 {
    public static void main(String[] args) {

        int [] arrayList = new int[4];
        arrayList[0]=10;
        arrayList[1]=20;
        arrayList[2]=30;
        arrayList[3]=40;

        System.out.println("Randomly selected: " + getRandom(arrayList));

    }
    public static int getRandom(int[] numbers){
        double random = Math.random()* numbers.length;
        int randomAsInt = (int) random;
        System.out.println("Index: " + String.valueOf(randomAsInt));
        System.out.println("Number: " + String.valueOf(numbers[randomAsInt]));

        return numbers[randomAsInt];
    }
}
