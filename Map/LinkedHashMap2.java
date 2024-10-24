import java.util.LinkedHashMap;

public class LinkedHashMap2 {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(2, "Even");
        linkedHashMap.put(3, "Odd");
        linkedHashMap.put(5, "Odd");
        linkedHashMap.put(8, "Even");
        System.out.println(linkedHashMap.entrySet());
        System.out.println(linkedHashMap.get(3));
        System.out.println(linkedHashMap.size());
        System.out.println(linkedHashMap.pollFirstEntry());
        System.out.println(linkedHashMap);
    }
}
