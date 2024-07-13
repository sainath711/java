package StreamApi1;

import java.util.Arrays;
import java.util.List;

public class evenS {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,31,21,11);
        long evens=numbers.stream().filter(num->num%2==0)
                .count();
        System.out.println(evens);
    }
}
