package collectionframeworks.arraylist;

import java.util.ArrayList;

public class One {
  static ArrayList A1=new ArrayList();

  static {
      A1.add(100);
      A1.add(200);
      A1.add(300);
  }
    public static void main(String[] args) {
        System.out.println(A1);

        System.out.println(A1);
        A1.add("sai");
        System.out.println(A1);
        System.out.println(A1.get(0));
        System.out.println(A1.isEmpty());
        System.out.println(A1.contains(200));
        System.out.println(A1.indexOf(200));
        System.out.println(A1.size());
        System.out.println(A1.add(400));
        System.out.println(A1);
        A1.set(0,99);
        System.out.println(A1);



    }
}
