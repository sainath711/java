package java8.predefinedFI;

import java.util.ArrayList;
import java.util.List;

interface one{
    boolean test(List list);
}
public class predicateone implements one{
    @Override
    public boolean test(List list) {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(101);
        al.add(102);
        al.add(103);
        System.out.println(al.isEmpty());
    }
}
