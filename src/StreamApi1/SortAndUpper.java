package StreamApi1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortAndUpper {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("sainath","swarup","vishnu","hareesh","shiva","pradush");
        List<String> upper=enames.stream().sorted().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);
    }
}
