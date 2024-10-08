package Lamda1;

import java.util.ArrayList;

public class ex {
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.forEach((n)->{
            System.out.println(n);
        });
        System.out.println(number);
    }
}
