package java81.fiLamdaPre;
//without Lamda
public interface Calc {
    public abstract int SquareIt(int num);
}
class CalcImpl implements Calc{
    @Override
    public int SquareIt(int num) {
        return num*num;
    }

    public static void main(String[] args) {
        Calc ci=new CalcImpl();
        System.out.println(ci.SquareIt(10));
    }
}
