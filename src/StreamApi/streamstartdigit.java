package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamstartdigit {
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("sai");
        enames.add("shiva");
        enames.add("raju");
        enames.add("khanna");
        enames.add("manju");
        System.out.println(enames);
        Stream<String> st=enames.stream();
        List<String> result=st.filter(name->name.startsWith("s")).collect(Collectors.toList());
        System.out.println(result);
    }
}
