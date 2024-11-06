package java8.predefinedFI;
//Predefined functional Interface
import java.util.function.Function;

public class TestOne {
    public static void main(String[] args) {
        Function<Integer,Integer> obj=num->num*num;
        System.out.println(obj.apply(10));
        System.out.println(obj.apply(5));
    }

}
