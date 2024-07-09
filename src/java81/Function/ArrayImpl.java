package java81.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayImpl {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("Rahul");
        al.add("Sonia");
        Function<List,Integer> f = list->list.size();
        Function<String,Integer> f1 =name->name.length();
        Function<Integer,Integer> f2=num->num+1;
        Function<Integer, Boolean> f3 = mark -> mark>35;

        Predicate<List> p = list->list.isEmpty();
        Predicate<String> ename = name-> name.length() > 5;

        System.out.println(ename.test("Rahul Gandhi"));
        System.out.println(p.test(al));

        System.out.println(f.apply(al));
        System.out.println(f1.apply("Rajul"));
        System.out.println(f2.apply(10));

        System.out.println(f3.apply(36));
    }
}
