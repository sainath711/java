package streamof;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class of1 {
    public static void main(String[] args) {
       /* Stream s=Stream.of(10,20,30,1,07);
        s.filter(i->i>2);
        System.out.println(i);*/
        List<Integer> s=new ArrayList<Integer>(List.of(10,20,30,1,07));
        List<Integer> num=s.stream().filter(i->i>2).collect(Collectors.toList());
        System.out.println(num);

    }
}
