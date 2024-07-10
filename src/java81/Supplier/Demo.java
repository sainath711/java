package java81.Supplier;

import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Supplier<String> ename=()->"Hello world";
        System.out.println(ename.get());
    }
}
