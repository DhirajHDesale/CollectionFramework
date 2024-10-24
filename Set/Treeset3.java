import java.util.Iterator;
import java.util.TreeSet;

public class Treeset3 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(20);
        ts.add(30);
        ts.add(10);
        ts.add(5);
        ts.add(8);
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.size());
       
    }
}
