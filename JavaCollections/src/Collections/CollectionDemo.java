package Collections;

/**
 * @author Tahmidul Islam
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionDemo {
    public static void show() {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        collection.add("b");
        collection.add("c");
        System.out.println(collection);

        Collections.addAll(collection, "a", "b", "c");
        System.out.println(collection);
        var size = collection.size();

        collection.remove("a");
        var containsA = collection.contains("a");
        System.out.println(collection);
        collection.clear();
        var isEmpty = collection.isEmpty();

        Object[] objectArray = collection.toArray();
        String[] stringArray = collection.toArray(new String[0]);

        Collection<String> other = new ArrayList<>();
        other.add("a");
        other.add("b");
        other.add("c");

        System.out.println(collection == other);
        System.out.println(collection.equals(other));
    }

    public static void main(String[] args) {
        show();
    }
}