package Lamda1;

public interface Cal1 {
    public abstract int By(int a,int b);
}
class Cal1impl{
    public static void main(String[] args) {
        Cal1 obj = (a, b) -> a * b;
        System.out.println(obj.By(10, 20));
    }
}
