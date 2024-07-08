package java81.Function;

import java.util.function.Function;

public class sum {
    public static void main(String[] args) {
        Function<Integer,Integer> add=(a)->a+a;{
            System.out.println(add.apply(10));
        }
    }
}
