package StreamApi1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class startswithItr {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("sainath","swarup","vishnu","hareesh","shiva","pradush");
        int No_of_enames=0;
        Iterator itr=enames.iterator();
        while (itr.hasNext()){
            if (itr.next().toString().startsWith("s")){
                No_of_enames++;
            }
        }
        System.out.println(No_of_enames);
    }
}
