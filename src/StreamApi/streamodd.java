package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamodd {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        al.add(100);
        al.add(101);
        al.add(102);
        al.add(103);
        al.add(104);
        al.add(105);
        al.add(106);
        System.out.println(al);
        Stream<Integer> stream=al.stream();
        List<Integer> odd_Numbers=stream.filter(num->num %2 ==1).collect(Collectors.toList());
        System.out.println(odd_Numbers);
    }
}
