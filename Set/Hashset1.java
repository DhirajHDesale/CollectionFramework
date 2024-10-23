import java.util.HashSet;
public class Hashset1 { 
    public static void main(String[] args) {  

        HashSet<Integer> hs = new HashSet<>();
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        System.out.println(hs);
        hs.remove(20);
        System.out.println(hs.isEmpty());
        
    }
}