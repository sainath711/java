package StreamApi1;

import java.util.ArrayList;

public class evenFor {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(31);
        numbers.add(21);
        numbers.add(11);
        for (int number:numbers){
            if (number%2==0){
                System.out.println(number);
            }
        }
    }
}
