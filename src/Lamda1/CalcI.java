package Lamda1;
//Without lamda
public interface CalcI {
    public abstract int add(int a,int b);
}
class CalcImpl implements CalcI{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        CalcI obj=new CalcImpl();
        System.out.println(obj.add(10,20));
    }
}
