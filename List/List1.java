import java.util.List;

import java.util.Iterator;

import java.util.ArrayList;
public class List1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Kiran");
        list.add("Shubham");
        list.add("Avinash");
        list.add("Kunal");
        list.add("Chetan");
        list.add("Yash");
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.set(0,"Dhiraj"));
        System.out.println(list.remove("Chetan"));
        System.out.println(list.contains("Shubham"));
        System.out.println(list.isEmpty());
        System.out.println(list.size());
       


        List<String> list2 = new ArrayList<>();
        list2.addAll(list);

        System.out.println(list2);

        list2.clear();

        System.out.println(list2);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        }
}