package collectionframeworks.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EmpCrud {
    public static void main(String[] args) {
        HashMap<Integer,String> employees=new HashMap<Integer,String>();
        employees.put(101,"Rahul");
        employees.put(102,"Sonia");
        employees.put(103,"Priya");
        employees.put(104,"Modi");
        System.out.println(employees);
        for (Integer key:employees.keySet()){
            System.out.println(key+":"+employees.get(key));
        }
        Set<Map.Entry<Integer,String>> emp_entries=employees.entrySet();
        for (Map.Entry<Integer,String>entry:emp_entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }
}
