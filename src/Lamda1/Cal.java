package Lamda1;

public interface Cal {
    public abstract int sum(int a,int b);

}
class CalImpl{
    public static void main(String[] args) {
        Cal obj=(a,b)->a+b;
        System.out.println(obj.sum(10,20));
    }
}
