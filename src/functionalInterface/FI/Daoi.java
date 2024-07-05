package functionalInterface.FI;

public interface Daoi {
    public abstract void login();
}
class Daoiimpl implements Daoi{
    @Override
    public void login() {
        System.out.println("Login Success");
    }

    public static void main(String[] args) {
        Daoi dao=new Daoiimpl();
        dao.login();
    }
}
