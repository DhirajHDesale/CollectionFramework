import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(20);
        linkedList.offer(2);
        linkedList.offerFirst(30);
        linkedList.addFirst(10);
        linkedList.push(20);
        linkedList.addLast(50);
        linkedList.offerLast(60);
        System.out.println(linkedList);
        System.out.println(linkedList.contains(20));
        System.out.println(linkedList.size());
        linkedList.set(0, 1);
        System.out.println(linkedList.element());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.get(2));
       linkedList.clear();
       System.out.println(linkedList);
    }
}
