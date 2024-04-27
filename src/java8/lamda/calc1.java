package java8.lamda;
interface cal{
    boolean m1(String ename);
}
public class calc1 implements cal{
    @Override
    public boolean m1(String ename) {
        return ename.length()>5 ;
    }

    public static void main(String[] args) {
       cal c1=new calc1();
        System.out.println(c1.m1("sainath"));
    }
}
