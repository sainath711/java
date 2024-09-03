package oops.Abstract;

public abstract class ex {
    public abstract void m1();

}
class ex1 extends ex{
    @Override
    public void m1() {
        System.out.println("Good morning");
    }

    public static void main(String[] args) {
        //System.out.println();
        ex1 a1=new ex1();
        a1.m1();
    }
}

