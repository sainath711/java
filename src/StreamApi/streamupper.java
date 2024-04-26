package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamupper {
    public static void main(String[] args) {
        List<String> enames=new ArrayList<String>();
        enames.add("sai");
        enames.add("shiva");
        enames.add("raju");
        enames.add("khanna");
        enames.add("manju");
        System.out.println(enames);
        List<String> upper=enames.stream().sorted().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);
    }
}
