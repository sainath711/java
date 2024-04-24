package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamtwo {
    public static void main(String[] args) {
        List<Integer> n=new ArrayList<Integer>();
        n.add(234);
        n.add(123);
        n.add(432);
        n.add(112);
        n.add(111);
        System.out.println(n);
        Stream<Integer> stream=n.stream();
        List<Integer> even_Numbers=stream.filter(num->num %2==0).collect(Collectors.toList());
        System.out.println(even_Numbers);

    }
}
