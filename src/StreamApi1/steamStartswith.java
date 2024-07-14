package StreamApi1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class steamStartswith {
    public static void main(String[] args) {
        List<String> enames= Arrays.asList("sainath","swarup","vishnu","hareesh","shiva","pradush");
        System.out.println(enames);
        long starts=enames.stream().filter(ename->ename.startsWith("s")).count();
        System.out.println(starts);

    }
}
