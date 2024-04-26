package StreamApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class upper {
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("sai");
        enames.add("shiva");
        enames.add("raju");
        enames.add("khanna");
        enames.add("manju");
        System.out.println(enames);
        List<String> users=new ArrayList<String>();
        Collections.sort(enames);
        for (String ename:enames){
            users.add(ename.toUpperCase());
        }
        System.out.println(users);
        System.out.println(enames);
    }
}
