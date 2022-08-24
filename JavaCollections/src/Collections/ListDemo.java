package Collections;

/**
 * @author Tahmidul Islam
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        // Add an item at a given index
        list.add(0, "!");
        System.out.println(list);
        // We can add multiple items in one go
        Collections.addAll(list, "a", "b", "c");
        System.out.println(list);


        System.out.println(list.subList(0, 2));
    }

    public static void main(String[] args) {
        show();
    }
}