package clf1.priority;

import java.util.PriorityQueue;

public class priorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> enames=new PriorityQueue<String>();
        System.out.println(enames);
        enames.offer("Avii");
        enames.offer("Rahul");

        enames.offer("Sonia");
        enames.offer("Priya");
        System.out.println(enames);
        System.out.println(enames.peek());
        //PEEK=printing the top element of priorityqueue
        System.out.println(enames);
    }
}
