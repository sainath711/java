package java81.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Rahul");
        Predicate<List> p=list -> list.isEmpty();
        System.out.println(p.test(al));
    }
}
