package java8.FI;
interface pre{
    boolean m1(String ename);
}
public class predined1 {
    public static void main(String[] args) {
        pre p=name->name.length()>5;
        System.out.println(p.m1("sai"));
    }
}
