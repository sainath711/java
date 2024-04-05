package defaultmethods;

public class TestImplOne implements TestI{
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    public static void main(String[] args) {
        TestI obj=new TestImplOne();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
