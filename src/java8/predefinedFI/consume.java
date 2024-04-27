package java8.predefinedFI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consume {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("sainath");
        al.add("Rakesh");
        al.add("mani");
        Consumer<List> p = names -> {
            for (Object name : names) {
                System.out.println(name);

            }

        };
        p.accept(al);
    }
}
