package StreamApi1;

import java.util.Arrays;
import java.util.List;

public class StartswithNoStrm {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("sainath","swarup","vishnu","hareesh","shiva","pradush");

        for (String name:enames){
            if (name.startsWith("s")) {
                System.out.println(name);
            }
        }
    }
}
