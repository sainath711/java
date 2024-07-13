package StreamApi1;

import java.util.ArrayList;

public class evenStream {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(31);
        numbers.add(21);
        numbers.add(11);
        numbers.stream().filter(num ->num%2== 0)
                .forEach(num-> System.out.println(num));
    }
}
