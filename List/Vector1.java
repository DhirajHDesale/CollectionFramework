import java.util.ListIterator;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);
        System.out.println(vector);
        System.out.println(vector.size());
        System.out.println(vector.get(2));
        vector.set(0, 10);
        System.out.println(vector);
        System.out.println(vector.indexOf(20));
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(1);
        vector2.add(2);
        vector2.add(3);
        vector.addAll(vector2);
      vector2.clear();
      System.out.println(vector2);

        
    }
}
