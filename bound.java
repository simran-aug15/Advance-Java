
// Bound wildcard
import java.util.*;

public class bound {
    static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<String> l2 = Arrays.asList("i", "j", "k");
        printList(l1);
        printList(l2);

    }
}