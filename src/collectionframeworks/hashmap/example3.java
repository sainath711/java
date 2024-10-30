package collectionframeworks.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class example3 {
    public static void main(String[] args) {
        HashMap<String,String> product=new HashMap<String,String>();
        product.put("p_id","101");
        product.put("p_name","Iphone");
        product.put("price","7500");
        product.put("color","Red");
        product.put("avail","true");
        System.out.println(product);
    System.out.println(product.keySet());
    Set<String> keys=product.keySet();
       System.out.println("Display values using keyset:");
        for (String key:keys) {
            System.out.println(key+":"+product.get(key));
        }
       System.out.println("Display values using values:");
        Collection<String> values=product.values();
        System.out.println(values);
        for (String value:values){
            System.out.println(value);
        }

  }
}
