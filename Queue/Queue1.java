import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;
public class Queue1{
    public static void main(String args[]){
Queue<Integer> queue = new LinkedList<>();
queue.offer(20);
queue.offer(30);
queue.add(40);
queue.offer(50);
queue.add(60);
queue.offer(70);
queue.remove(20);
queue.remove();
queue.poll();

System.out.println(queue);
System.out.println(queue.peek());
System.out.println(queue.size());

Iterator<Integer> it = queue.iterator();
while(it.hasNext()){
    System.out.println(it.next());
}
queue.clear();
System.out.println(queue);

    }
}