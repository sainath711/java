package StreamApi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenUprNoStrm {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("sainath","swarup","vishnu","hareesh","shiva","pradush");

        List<String> new_enames=new ArrayList<String>();
        Collections.sort(enames);
        for (String ename:enames){
            new_enames.add(ename.toUpperCase());


        }
        System.out.println(new_enames);
    }
}
