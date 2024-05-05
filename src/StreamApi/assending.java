package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class assending {
    public static void main(String[] args) {
        List<Integer> s=new ArrayList<Integer>(List.of(101,100,102,99,108));
        List<Integer> assend=s.stream().sorted().collect(Collectors.toList());
        System.out.println(assend);

    }
}
