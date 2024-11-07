package java81.Supplier;
interface SOne{
    int get();
}
public class TestTwo implements SOne {
    @Override
    public int get() {
        return 100;
    }

    public static void main(String[] args) {
       SOne obj=new TestTwo();
        System.out.println(obj.get());
    }


}
