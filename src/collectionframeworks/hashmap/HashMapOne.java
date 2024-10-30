package collectionframeworks.hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class HashMapOne {
    public static void main(String[] args) {
      ArrayList al=new ArrayList(Arrays.asList(101,102,103));
        HashMap<String,String> emp=new HashMap<String,String>();
        System.out.println(al);
        System.out.println(emp);
        emp.put("eid","101");
        emp.put("ename","SAINATH");
        emp.put("esal","20000");
        System.out.println(emp);
        System.out.println(emp.get("eid"));
        System.out.println(emp.get("ename"));
        System.out.println(emp.get("esal"));
    }
}
