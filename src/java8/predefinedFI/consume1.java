package java8.predefinedFI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consume1 {
    public static void main(String[] args) {
         List<String> enames=new ArrayList<String>();
         enames.add("sainath");
         enames.add("manoj");
         enames.add("bunty");
        Consumer<List> p=names->{for (Object name: names){
                                    System.out.println(name);}
                                };
        p.accept(enames);
    }
}
