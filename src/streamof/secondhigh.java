package streamof;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class secondhigh {
    public static void main(String[] args) {
        List<Integer> s=new ArrayList<Integer>(List.of(10,20,30,40,50));
        List<Integer> big=s.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).collect(Collectors.toList());
        System.out.println(big);
    }
}
