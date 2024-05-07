package streamof;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Accend {
    public static void main(String[] args) {
        List<Integer> s= Arrays.asList(50,40,30,20,10);
        List<Integer> acc=s.stream().sorted().collect(Collectors.toList());
        System.out.println(acc);
    }
}
