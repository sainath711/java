package defaultmethods.dfex;



public interface Daoi1 {
    void login();
    void logout();
    public default void forget_pass(){
        System.out.println("Password reset");
    }
}
class Daoimpl implements Daoi1{

    @Override
    public void login() {
        System.out.println("login Successfully");
    }

    @Override
    public void logout() {
        System.out.println("Logout successfully");
    }

    public static void main(String[] args) {
        Daoi1 d1=new Daoimpl();
        d1.login();
        d1.logout();
        d1.forget_pass();
    }
}
