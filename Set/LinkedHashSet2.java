import java.util.LinkedHashSet;
public class LinkedHashSet2 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkhs = new LinkedHashSet<>();
linkhs.add(20);
linkhs.add(30);
linkhs.add(10);
System.out.println(linkhs);
System.out.println(linkhs.size());
System.out.println(linkhs.contains(20));

    }
}
