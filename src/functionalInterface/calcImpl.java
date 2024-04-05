package functionalInterface;

interface calc {
    public abstract int sum(int a,int b);
}
public class calcImpl{
    public static void main(String[] args){
        calc calc=(a,b)->a-b;
        System.out.println(calc.sum(100,200));
    }
}
