import java.util.ArrayList;
import java.util.List;

public class evenfor {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<Integer>();
        al.add(101);
        al.add(102);
        al.add(103);
        al.add(104);
        System.out.println(al);
        List<Integer> ol=new ArrayList<Integer>();
        for (Integer as:al){
            if(as%2==0){
               ol.add(as);
            }
            System.out.println(ol);
        }
    }
}
