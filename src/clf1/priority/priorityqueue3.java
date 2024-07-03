package clf1.priority;

import java.util.PriorityQueue;

public class priorityqueue3 {
    public static void main(String[] args) {
        PriorityQueue<Integer> eid=new PriorityQueue<Integer>();
        eid.add(20);
        eid.add(30);
        eid.add(10);
        System.out.println(eid.peek());
        System.out.println(eid);
    }
}
