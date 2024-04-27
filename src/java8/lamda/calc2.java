package java8.lamda;
interface pal{
    boolean m1(String ename);
}
public class calc2 {
    static pal p=(name)->{return name.length()>5;};

    public static void main(String[] args) {
        System.out.println(p.m1("sainath"));
    }
}
