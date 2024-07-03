package collectionframeworks.hashmap;

import java.util.HashMap;

public class example2 {
    public static void main(String[] args) {
        HashMap<String,String> emp=new HashMap<String,String>();
        emp.put("id","101");
        emp.put("name","Rahul");
        emp.put("sal","45000");
        System.out.println(emp);
        System.out.println(emp.get("name"));
        System.out.println(emp.values());
        System.out.println(emp.keySet());
        System.out.println(emp.entrySet());

    }
}
