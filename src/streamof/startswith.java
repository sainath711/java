package streamof;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startswith {
    public static void main(String[] args) {
        List<String> s= Arrays.asList("sai","sainath","manu","mani","raki","ram");
        List<String> n=s.stream().filter(name->name.startsWith("r")).collect(Collectors.toList());
        System.out.println(n);
    }
}
