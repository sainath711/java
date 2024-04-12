package collectionframeworks.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class three {
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<Integer>();
        a1.add(102345);
        a1.add(1022);
        a1.add(10342);
        a1.add(132);
        a1.add(1024);
        a1.add(1052);
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);
        Collections.sort(a1,Collections.reverseOrder());
        System.out.println(a1);
        Collections.shuffle(a1);
        System.out.println(a1);
        /*Iterator itr=a1.iterator();
        while (itr.hasNext()){  using while
            System.out.println(itr.next());
        }
        for (int i=1;i<= a1.size()-1;i++){
            System.out.println(a1.get(i)); using normal for
        }*/
       for(Integer a2:a1){
           System.out.println(a2);
       }
    }
}
