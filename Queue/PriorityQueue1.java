import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String args[]){
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(20);
        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.add(5);
        priorityQueue.add(40);
        priorityQueue.offer(8);
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.size());
        System.out.println(priorityQueue.contains(10));
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.remove(20));

        System.out.println(priorityQueue);
        priorityQueue.clear();
        System.out.println(priorityQueue);
    }
}
