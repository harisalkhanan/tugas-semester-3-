import java.util.ArrayList;

public class GetTest {
    public static void main(String[] args) {
        // list 1 with default capacity 10
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Emily");
        arr.add("Bob");
        arr.add("Cindy");
        arr.add("Anne");
        arr.add("Deasy");
        System.out.println(arr);

        // using get() method
        String str = arr.get(3);
        System.out.println("At index 3 number is=" + str);
    }
}
