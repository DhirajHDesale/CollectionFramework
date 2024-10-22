import java.util.ArrayDeque;
public class ArrayDequeue1 {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrd = new ArrayDeque<>();
        arrd.addFirst(20);
        arrd.add(10);
        arrd.push(30);
        arrd.offer(5);
        arrd.offerLast(50);
        arrd.offerFirst(1);
        System.out.println(arrd.getFirst());
        System.out.println(arrd.peek());
        System.out.println(arrd.peekLast());
        System.out.println(arrd.removeFirst());
        System.out.println(arrd.peek());
        System.out.println(arrd.poll());
     
    }
}
