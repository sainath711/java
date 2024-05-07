package streamof;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class secondleast {
    public static void main(String[] args) {
        List<Integer> s= Arrays.asList(50,40,30,20,10);
        List<Integer> sml=s.stream().sorted().limit(2).skip(1).collect(Collectors.toList());
        System.out.println(sml);
    }
}
