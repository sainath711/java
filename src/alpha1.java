import java.util.ArrayList;
import java.util.List;

public class alpha1 {
    public static void main(String[] args) {
        List<String> al = new ArrayList<String>();
        al.add("sai");
        al.add("manoj");
        al.add("shiva");
        al.add("rakesh");
        al.add("mani");
        al.add("sainath");
        System.out.println(al);
        List<String> ol = new ArrayList<String>();
        for (String name : al) {
            if (name.startsWith("m")) {

                ol.add(name);
            }
        }
        System.out.println(ol);
    }
}

