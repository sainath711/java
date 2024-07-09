package java81.Function;

import java.util.function.Function;

public class Upper {
    public static void main(String[] args) {
        Function<String,String> f=name->name.toUpperCase();
        System.out.println(f.apply("Rahul"));
    }
}
