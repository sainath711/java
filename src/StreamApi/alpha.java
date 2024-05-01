package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class alpha {
    public static void main(String[] args) {
        List<String> al=new ArrayList<String>();
        al.add("sai");
        al.add("shiva");
        al.add("raju");
        al.add("khanna");
        al.add("sainath");
        System.out.println(al);
        List<String> ol=al.stream().filter(ap->ap.startsWith("s")).collect(Collectors.toList());
        System.out.println(ol);
    }
}
