import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrl = new ArrayList<>();
        arrl.add(20);
        arrl.add(30);
        arrl.add(40);
        arrl.add(50);
        arrl.add(1);
        System.out.println(arrl);
        ArrayList<Integer> arrl2 = new ArrayList<>();
        arrl2.add(1);
        arrl2.add(2);
        arrl2.add(3);
        arrl2.add(4);
        arrl2.add(50);
        arrl.addAll(arrl2);

        arrl2.retainAll(arrl);
        arrl.containsAll(arrl2);
        System.out.println(arrl);

        System.out.println(arrl.size());
    }
}   
