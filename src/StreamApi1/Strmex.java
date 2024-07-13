package StreamApi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Strmex {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(31);
        numbers.add(21);
        numbers.add(11);
        Stream st=numbers.stream();
        List even_nums=numbers.stream().filter(num->num % 2==0)
                .collect(Collectors.toList());
        System.out.println(even_nums);

    }
}
