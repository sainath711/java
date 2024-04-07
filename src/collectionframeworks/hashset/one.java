package collectionframeworks.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class one {
    public static void main(String[] args) {
        HashSet<Integer> h1=new HashSet<Integer>();
        h1.add(100);
        h1.add(200);
        h1.add(300);
        h1.add(400);
        h1.add(200);//duplicates are not allowed
        System.out.println(h1);
        HashSet<String> h2=new HashSet<String>();
        h2.add("sai");
        h2.add("mani");
        h2.add("rakesh");
        System.out.println(h2);
        Iterator itr=h2.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
