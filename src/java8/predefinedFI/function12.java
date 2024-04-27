package java8.predefinedFI;
interface pre{
    int m1(String ename);
}
public class function12 implements pre{
    @Override
    public int m1(String ename) {
        return ename.length();
    }

    public static void main(String[] args) {
       pre f=new function12();
        System.out.println(f.m1("sainath "));


    }
}
