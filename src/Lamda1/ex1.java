package Lamda1;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(5);
        number.add(9);
        number.add(8);
        number.add(1);
        Consumer<Integer> method=(n)->{
            System.out.println(n);
        };
        number.forEach(method);
//        number.forEach(n->{
//            System.out.println(n);
//        });

    }
}
