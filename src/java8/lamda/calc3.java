package java8.lamda;

import java.util.function.Predicate;

public class calc3 {
    public static void main(String[] args) {
        Predicate<String> p=(name)->{return name.length()>5;};
        System.out.println(p.test("sainath"));
    }
}
