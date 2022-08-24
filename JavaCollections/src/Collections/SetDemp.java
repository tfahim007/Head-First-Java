package Collections;

/**
 * @author Tahmidul Islam
 */
import java.util.*;

public class SetDemp {
    public static void show() {
        Set<String> set1 =
                new HashSet<>(Arrays.asList("a", "b", "c"));
        System.out.println(set1);
        Set<String> set2 =
                new HashSet<>(Arrays.asList("b", "c", "d"));
        System.out.println(set2);
        // Union
        set1.addAll(set2);
        System.out.println(set1);
        // Intersection
        set1.retainAll(set2);
        System.out.println(set1);
        // Difference
        set1.removeAll(set2);
        System.out.println(set1);
    }

    public static void main(String[] args) {
        show();
    }
}
