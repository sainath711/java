package clf1.priority;

import java.util.PriorityQueue;

public class priorityqueue2 {
    public static void main(String[] args) {
        PriorityQueue<String> enames=new PriorityQueue<String>();
        System.out.println(enames);
        enames.offer("Avii");
        enames.offer("Rahul");

        enames.offer("Sonia");
        enames.offer("Priya");
        System.out.println(enames);
        System.out.println(enames.poll());
        //PEEK=printing the top element and removing it from priorityqueue container
        System.out.println(enames);
    }
}
