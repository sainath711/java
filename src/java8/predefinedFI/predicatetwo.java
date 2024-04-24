package java8.predefinedFI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicatetwo {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        al.add(101);
        al.add(102);
        al.add(103);
        Predicate<List> p=list->list.isEmpty();
        System.out.println(p.test(al));
    }
}
