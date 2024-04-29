package java8.predefinedFI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class predicate1 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("sai");
        al.add("manoj");
        al.add("Bunty");
        al.add("mani");
        Predicate<String> p = names -> {
            return names.isEmpty();
        };

    }
}
