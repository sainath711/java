package java8.FI;

import java.util.function.Predicate;

public class predined {
    public static void main(String[] args) {
        Predicate<String> p=name->name.length()>5;
        System.out.println(p.test("sainath"));
    }
}
