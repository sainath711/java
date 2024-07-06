package Lamda1;

public interface Daoi4 {
    public abstract void login();
}
class Daoi4impl implements Daoi4{
    @Override
    public void login() {
        System.out.println("Login Successfully");
    }

    public static void main(String[] args) {
        Daoi4 obj=new Daoi4impl();
        obj.login();
    }
}
