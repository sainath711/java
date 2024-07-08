package java81.fiLamdaPre;
//Using Lamda
public interface Calc1 {
    public abstract int SquareIt(int num);
}
class Calc1Impl{
    public static void main(String[] args) {
        Calc1 ci=num -> num*num;
        System.out.println(ci.SquareIt(10));
    }
}