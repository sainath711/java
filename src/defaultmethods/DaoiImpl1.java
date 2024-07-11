package defaultmethods;

public class DaoiImpl1 implements Daoi {
    @Override
    public void login() {
        System.out.println("Login Successfully");
    }

    @Override
    public void logout() {
        System.out.println("Logout Successfully");
    }

    public static void main(String[] args) {
        Daoi obj=new DaoiImpl1();
        obj.login();
        obj.logout();
    }
}
