package java81.fiLamdaPre;

import java.util.Arrays;
import java.util.List;

interface FOne{
    int Accept(List numbers);
}
public class TestTwo {
    public static void main(String[] args) {
        List<Integer> al= Arrays.asList(10,20,30,40);
        FOne obj=numbers -> numbers.size();
        System.out.println(obj.Accept(al));

    }
}
