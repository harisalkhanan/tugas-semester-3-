import java.util.ArrayList;

public class RemoveTest {
    public static void main(String[] args) {
        // list 1 with default capacity 10
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Emily");
        arr.add("Bob");
        arr.add("Cindy");
        arr.add("Anne");
        arr.add("Deasy");
        System.out.println("Original ArrayList: " + arr);

        // Remove element using index
        arr.remove(2);
        System.out.println("After removing index 2: " + arr);

        // Remove element using object
        arr.remove("Anne");
        System.out.println("After removing 'Anne': " + arr);
    }
}
