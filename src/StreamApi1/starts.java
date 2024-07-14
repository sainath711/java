package StreamApi1;

import java.util.Arrays;
import java.util.List;

public class starts {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("sainath","swarup","vishnu","hareesh","shiva","pradush");
        //enames.stream().filter(name->name.startsWith("s")).forEach(name->System.out.println(name));
        enames.stream().filter(name->name.startsWith("s")).forEach(System.out::println);
    }
}
