package java8.FI;
interface pre1{
    boolean m1(String ename);
}
public class predined2 implements pre1{
    @Override
    public boolean m1(String ename) {
        return ename.length()>5;
    }

    public static void main(String[] args) {
        pre1 f=new predined2();
        System.out.println(f.m1("sainath"));
    }
}
