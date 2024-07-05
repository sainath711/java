package Lamda1;
//using Lamda Expression
public interface Daoi3 {
    public abstract void login();
}
class Daoiimpl3{
    public static void main(String[] args) {
        Daoi3 dao=()->{
            System.out.println("Login Success");};
            dao.login();

    }
}
