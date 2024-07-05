package Lamda1;
//Using Lamda
public interface CalcI1 {
    public abstract int add(int a,int b);
}
class Calcimpl1{
    public static void main(String[] args) {
        CalcI obj=(a,b)->a+b;
        System.out.println(obj.add(10,20));
    }
}
