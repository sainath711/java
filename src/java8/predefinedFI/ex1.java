package java8.predefinedFI;
interface ex{
    int m1(int a,int b);
}
public class ex1 implements ex{
    @Override
    public int m1(int a,int b) {
        return a+b;
    }
    public static void main(String[] args) {
       ex e=new ex1();
       System.out.println(e.m1(10,20));
    }
}
