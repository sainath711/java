package Lamda1;

public interface Cal11 {
    public abstract int By(int a,int b);
}
class Cal11Impl implements Cal11{
    @Override
    public int By(int a, int b) {
        return a*b;
    }

    public static void main(String[] args) {
        Cal11 obj=new Cal11Impl();
        System.out.println(obj.By(10,20));
    }
}
