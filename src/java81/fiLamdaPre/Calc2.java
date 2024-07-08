package java81.fiLamdaPre;

import java.util.function.Function;
//Using Predifined FI
public class Calc2 {
    public static void main(String[] args) {
        Function<Integer,Integer> ci=num->num*num;
        System.out.println(ci.apply(10));
    }
}
