package functionalInterface.FI;
//Functional Interface with 2 methods without restricting the FI
public interface Daoi {
    public abstract void login();
    public abstract void logout();
}
class Daoiimpl implements Daoi{
    @Override
    public void login() {
        System.out.println("Login Success");
    }

    @Override
    public void logout() {
        System.out.println("Logout success");
    }

    public static void main(String[] args) {
        Daoi dao=new Daoiimpl();
        dao.login();
        dao.logout();
    }
}
