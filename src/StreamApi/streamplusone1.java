package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamplusone1 {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        for (int i = 0; i <=10; i++) {
            al.add(i);
        }
        System.out.println(al);
        /*Stream<Integer> st=al.stream();
        List<Integer> ol=st.map(num->num+1).collect(Collectors.toList());
        System.out.println(ol);*/
        List<Integer> ol=al.stream().map(num->num+1).collect(Collectors.toList());
        System.out.println(ol);
    }
}
