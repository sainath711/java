package collectionframeworks.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class hmdemo {
    public static void main(String[] args) {
        HashMap<String,Object> H1=new HashMap<String,Object>();
        H1.put("Id",101);
        H1.put("name1","sai");
        H1.put("Id1",101);
        H1.put("salary1",40000);
        H1.put("name","shiva");
        H1.put("salary",50000);
        System.out.println(H1);
        Collection<Object> values =H1.values();
        for (Object value:values) {
            System.out.println(value);
        }
        Set<String> keys=H1.keySet();
        for (String key: keys){
            System.out.println(key);
        }

    }
}
