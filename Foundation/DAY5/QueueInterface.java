package DAY5;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueInterface {
    static void PriorityQueueExample(){
        PriorityQueue<Integer> pq = new PriorityQueue<>(); // min pq
        pq.add(2);
        pq.add(4);
        pq.add(1);
        System.out.println(pq);
    }


    static void QueueExample(){
        LinkedList<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println(q.peek()); // 1
        System.out.println(q); // [1,2,3]
        System.out.println(q.poll()); // 1
        System.out.println(q.peek()); // 2
        System.out.println(q); // [2,3]
        System.out.println(q.size()); // 2
    }

    public static void main(String[] args) {
        // QueueExample();
        PriorityQueueExample();
    }
}
