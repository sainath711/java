package defaultmethods;

public class DaoiImpl implements Daoi{
    @Override
    public void login(){
        System.out.println("login Successfully");
    }

    @Override
    public void logout() {
        System.out.println("logout successfully");
    }

    public static void main(String[] args) {
        DaoiImpl d1=new DaoiImpl();
        d1.login();
        d1.logout();
        d1.forgot_password();
    }
}
