package collectionframeworks.arraylist;

import java.util.ArrayList;

public class Two {
    public static void main(String[] args) {
        ArrayList a2=new ArrayList();
        ArrayList A1=One.A1;
        System.out.println(A1);
        a2.add(10);
        System.out.println(A1.addAll(a2));
        System.out.println(A1);
        System.out.println(A1.addAll(0,a2));
        System.out.println(A1);

    }
}
