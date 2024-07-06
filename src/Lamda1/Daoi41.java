package Lamda1;

public interface Daoi41 {
    public abstract void login();
}
class Daoi41impl{
    public static void main(String[] args) {
       Daoi4 obj=()->{
            System.out.println("Login successfully");
        };
        obj.login();
    }

}
