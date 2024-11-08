package java81.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class TestOne {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(10,20,30);
        System.out.println(al);
        Predicate<List> obj1=numbers->numbers.isEmpty();
        System.out.println(obj1.test(al));
    }
}