package java8.lamda;
interface DaoI{
    public abstract void login();
}
public class TestOne {
    public static void main(String[] args) {
        DaoI obj=()->{
            System.out.println("Login Successfully");
        };
        obj.login();
    }
}
