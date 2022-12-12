import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortsCharactersInAString7_34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String taken = s.nextLine();
        System.out.println(sort(taken));
    }
    public static String sort(String s){
        List<String> list = new ArrayList<String>();
        char[] chars = s.toCharArray();
        for(char c : chars) {list.add(String.valueOf(c));}
        Collections.sort(list);

        System.out.println("list: " + list);

        String newText = "";
        for(String c : list) {

            System.out.println("1 " + newText);

            newText += c;

            System.out.println("2 " + newText);
        }
        return newText;
    }
}
