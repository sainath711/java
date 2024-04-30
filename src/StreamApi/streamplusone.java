package StreamApi;

import java.util.ArrayList;
import java.util.List;

public class streamplusone {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        for (int i = 0; i <=10; i++) {
            al.add(i);
        }
        System.out.println(al);
        List<Integer> ol=new ArrayList<Integer>();
        for (Integer as:al){
            ol.add(as+1);
        }
        System.out.println(ol);
    }
}
