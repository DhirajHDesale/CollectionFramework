import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {
        TreeMap<String,String> tr = new TreeMap<>();
        tr.put("Name", "Kiran");
        tr.put("Gender", "Male");
        tr.put("Education", "MCA");
        tr.put("Skills", "Java,Python");
        System.out.println(tr);
        System.out.println(tr.entrySet());
        System.out.println(tr.firstKey());
        System.out.println(tr.lastKey());
        System.out.println(tr.values());
        
    }
}
