package collectionframeworks.linkedlist;


import java.util.ArrayList;
import java.util.LinkedList;

public class generic1 {
    public static void main(String[] args) {
        LinkedList<Integer> A3=new LinkedList<Integer>();
        A3.add(101);
        A3.add(102);
        System.out.println(A3);
        //A3.add("sai");
        A3.addFirst(100);
        System.out.println(A3);
    }
}

class generic3{
    public static void main(String[] args) {
        LinkedList<String> A3=new LinkedList<>();
        A3.add("sai");
        A3.add("mani");
        System.out.println(A3);
        //A3.add(100);
        System.out.println(A3);
    }
}
