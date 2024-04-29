package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class evenApi {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        al.add(0);
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        System.out.println(al);
        Stream<Integer> st=al.stream();
        List<Integer> even=st.filter(al1->al1%2==0).collect(Collectors.toList());

        System.out.println(even);




    }
}
