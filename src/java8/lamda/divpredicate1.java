package java8.lamda;

import java.util.ArrayList;
import java.util.function.Predicate;

public class divpredicate1 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(20);
        al.add(13);
        al.add(14);
        al.add(24);
        Predicate<Integer> p=number->number%4==0;
        al.forEach(id -> {
            if(p.test(id)){
                System.out.println(id);
            }
        });
    }
}
