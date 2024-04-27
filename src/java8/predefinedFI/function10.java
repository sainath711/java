package java8.predefinedFI;

import java.util.function.Function;

public class function10 {
   static Function<String,Integer> f=name->name.length();
    public static void main(String[] args) {

        String ename="Sainath Dasari";
        System.out.println(f.apply(ename));
    }
}
