package java8.predefinedFI.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumeone {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("sai");
        al.add("chaitanya");
        al.add("shiva");
        System.out.println(al);
        Consumer<List> s = names -> {
            for (Object name : names) {
                System.out.println(name);
            }
        };
        s.accept(al);
    }

}
