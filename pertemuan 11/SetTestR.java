import java.util.ArrayList;

public class SetTestR {
    public static void main(String[] args) {
        // list 1 with default capacity 10
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add(20);
        arr.add("Cindy");
        arr.add(null);
        System.out.println(arr);

        /* Call set() method to replace an element null 
           in list with "Deasy" element at position 4. */
        arr.set(4, "Deasy");
        System.out.println(arr);

        /* Call set() method to replace an element 20 
           in list with "Anne" element at position 2. */
        arr.set(2, "Anne");
        System.out.println(arr);
    }
}
