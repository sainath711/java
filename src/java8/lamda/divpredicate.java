package java8.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class divpredicate {
    public static void main(String[] args) {
        int[] ids = {22, 26, 96, 20};
        Predicate<Integer> var=number->number%4==0;
        for (int id:ids){
            if(var.test(id)){
                System.out.println(id);
            }
        }
    }
}