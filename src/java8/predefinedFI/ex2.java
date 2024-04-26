package java8.predefinedFI;
interface calc{
    int m1(int a,int b);
}
public class ex2 {
   static calc f =(a,b)->{ return a+b;};
   public static void main(String[] args) {
        System.out.println(f.m1(10,20));

    }
}

