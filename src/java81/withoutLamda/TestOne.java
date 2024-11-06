package java81.withoutLamda;

import java.util.Arrays;
import java.util.List;

interface POne{
    boolean test(List numbers);
}
public class TestOne implements POne {
    public boolean test(List numbers){
        return numbers.isEmpty();
    }

    public static void main(String[] args) {
        POne obj=new TestOne();
        List<Integer> al= Arrays.asList(10,20,30,40);
        System.out.println(obj.test(al));
    }
}
