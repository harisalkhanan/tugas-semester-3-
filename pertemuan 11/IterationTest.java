import java.util.ArrayList;

public class IterationTest {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Emily");
        arr.add("Bob");
        arr.add("Cindy");
        arr.add("Anne");
        arr.add("Deasy");

        // using the get() method and the for loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        // using the for-each loop
        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
