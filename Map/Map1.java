import java.util.Map;
import java.util.HashMap;
public class Map1{
    public static void main(String args[]) {
        Map<String,String> map = new HashMap<>();
        map.put("Name: ", "Kiran");
        map.put("Age: ", "24");
        map.put("email: ", "kiran@gmail.com");
        map.put("City: ", "Pune");
        System.out.println(map);
        System.out.println(map.containsKey("RollNo"));
        System.out.println(map.get("Age: "));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map);
    }
}