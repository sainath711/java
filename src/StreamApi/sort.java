package StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sort {
    public static void main(String[] args) {
        List<Integer> sort=new ArrayList<Integer>(List.of(100,101,102,99,89));
        // Asscending order
        List<Integer> assend=sort.stream().sorted().collect(Collectors.toList());
        System.out.println(assend);
        //Dissending order
        List<Integer> sorted=sort.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sorted);
    }
}
