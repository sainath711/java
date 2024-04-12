package collectionframeworks.arraylist;

import java.util.ArrayList;

public class four {
    public static void main(String[] args) {
        ArrayList a2=new ArrayList();
        a2.add(100);
        a2.add(200);
        a2.add(400);
        a2.add(300);
        a2.add(100);
        System.out.println(a2);
        a2.add(0,99);
        System.out.println(a2);
    }
}
