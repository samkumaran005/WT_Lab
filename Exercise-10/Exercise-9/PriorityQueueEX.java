import java.util.*;
public class PriorityQueueEX {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(3);
        pq.add(8);
        pq.add(12);
        System.out.println("PriorityQueue (ascending order): ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}