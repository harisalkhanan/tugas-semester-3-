import java.util.ArrayList;

public class AddTest {
    public static void main(String[] args) {
        // list 1 with default capacity 10
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add(20);
        arr.add("Cindy");
        arr.add(null);
        System.out.println(arr);

        // list 2
        ArrayList arr1 = new ArrayList();
        arr1.add("Emily");
        arr1.add("Bob");
        arr1.add("Cindy");
        System.out.println(arr1);

        /* Call addAll(Collection c) method 
           using reference variable arr 
           to add all elements at the end of the list1. */
        arr.addAll(arr1);
        System.out.println(arr);

        /* Call addAll(int index, Collection c) method 
           using reference arr1 
           to add all elements at specified position 2. */
        arr1.addAll(2, arr);
        System.out.println(arr1);
    }
}
