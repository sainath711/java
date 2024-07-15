package BiFunction;

import java.util.function.BiFunction;

public class test2 {
    public static void main(String[] args) {
        BiFunction<String,String,Integer> obj=(fn,ln)->(fn+ln).length();
        System.out.println(obj.apply("Rahul","Gandhi"));
    }
}
