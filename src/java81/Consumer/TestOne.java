package java81.Consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestOne {
    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(100,200,300,400);
        Consumer<List> c=(numbers1)->{
            for ( Object number:numbers1){
                System.out.println(number);
            }
        };
        c.accept(numbers);
    }
}
