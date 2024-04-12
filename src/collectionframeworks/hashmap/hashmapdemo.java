package collectionframeworks.hashmap;

import java.util.HashMap;

public class hashmapdemo {
    public static void main(String[] args) {
      HashMap<Integer,String> hm=new HashMap<Integer,String>();
      hm.put(101,"sai");
      hm.put(102,"lokesh");
        System.out.println(hm);
        System.out.println(hm.get(101));
        System.out.println(hm.isEmpty());
        System.out.println(hm.containsKey(101));
        System.out.println(hm.containsValue("sai"));
    }
}
