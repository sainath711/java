package functionalInterface.FI;
//Here we are restricting the FI by using @FI Only single method is allowed
@FunctionalInterface
public interface Daoi2 {
    public abstract void login();
}
class Daoiimpl2 implements Daoi2{
    @Override
    public void login() {
        System.out.println("Login success");
    }

    public static void main(String[] args) {
        Daoi2 dao=new Daoiimpl2();
        dao.login();
    }
}
