package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class streamone {
    public static void main(String[] args) {
        List<Integer> n=new ArrayList<Integer>();
        n.add(234);
        n.add(123);
        n.add(432);
        n.add(112);
        n.add(111);
        System.out.println(n);
        Collections.sort(n);
        System.out.println(n);

    }
}
