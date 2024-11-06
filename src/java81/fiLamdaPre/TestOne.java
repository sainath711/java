package java81.fiLamdaPre;

import java.util.Arrays;
import java.util.List;

interface POne{
    boolean test(List numbers);
}
public class TestOne {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(10,20,30,40);
        POne obj=numbers -> numbers.isEmpty();
        System.out.println(obj.test(al));
    }
}
