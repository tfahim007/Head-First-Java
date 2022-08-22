/**
 * @author Tahmidul Islam
 */
import java.util.Comparator;
import java.util.PriorityQueue;
class MyCom implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return 1;
        }
        if (o1 > o2) {
            return -1;
        }
        return 0;
    }
}


public class Main{
    public static void main(String[] args) {
        PriorityQueue<Integer> p = new PriorityQueue<>(
                new MyCom()
        );

        //we can use offer() method instead of add method.
        p.add(20);
        p.add(10);
        p.add(30);
        p.add(5);
        p.add(15);
        p.add(3);

       //supposed to print 20. but got 3.
        while(!p.isEmpty()){
            System.out.println(p.peek());
            p.poll();
        }

    }

}
