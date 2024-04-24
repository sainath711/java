package java8.predefinedFI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

interface two{
    boolean test(List list);
}
public class predicatethree {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        al.add(101);
        al.add(102);
        al.add(103);
        two p1=list1->list1.isEmpty();
        Predicate<List> p=list -> list.isEmpty();
        System.out.println(p.test(al));
        System.out.println(p1.test(al));
    }
}
