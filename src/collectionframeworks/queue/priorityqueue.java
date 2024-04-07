package collectionframeworks.queue;

import java.util.PriorityQueue;

public class priorityqueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        pq.offer(100);
        System.out.println(pq.element());
        System.out.println(pq.poll());
        System.out.println(pq);
        pq.offer(100);
        System.out.println(pq);


    }
}
