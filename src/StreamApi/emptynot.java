package StreamApi;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class emptynot {
    public static void main(String[] args) {
        List<String> al=new ArrayList<String>();
        al.add("mani");
        al.add("raki");
        al.add("sai");
        System.out.println(al);
        Predicate<List<String>> ol = name->name.containsAll(al);

        System.out.println(ol.test(al));
    }
}
