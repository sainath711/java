package streamof;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class descending {
    public static void main(String[] args) {
        List<Integer> s= Arrays.asList(10,20,30,40,50);
        List<Integer> des=s.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(des);
    }
}
