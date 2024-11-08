package StreamApi1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenStreamCollect {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(10,20,30,31,21,11);
        List even_numbers=numbers.stream().filter(number->number%2==0)
                .collect(Collectors.toList());
        List Odd_numbers=numbers.stream().filter(number->number%2!=0).collect(Collectors.toList());
        System.out.println(even_numbers);
        System.out.println(Odd_numbers);
    }
}
