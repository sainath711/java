package java81.predicate;

import java.util.function.Predicate;
//Predicate expect the output in boolean
public class Calc {
    public static void main(String[] args) {
        Predicate<Integer> p=num->num%2==0;
        System.out.println(p.test(10));
    }
}
