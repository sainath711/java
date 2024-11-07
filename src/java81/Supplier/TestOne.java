package java81.Supplier;

import java.util.function.Supplier;

public class TestOne {
    public static void main(String[] args) {
        Supplier<String> s=()->"Good Morning";
        System.out.println(s.get());
    }
}
