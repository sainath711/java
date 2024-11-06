package java8.predefinedFI;

import java.util.function.Function;

public class FunctionPre {
    public static void main(String[] args) {
        Function<String,Integer> obj=ename->ename.length();
        System.out.println(obj.apply("Rahul"));
    }
}
