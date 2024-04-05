package defaultmethods;

public interface TestI {
    public abstract void m1();
    public abstract void m2();
    public default void m3(){
        System.out.println("executes successfully");
    }

}
