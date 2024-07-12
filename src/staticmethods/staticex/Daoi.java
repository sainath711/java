package staticmethods.staticex;



public interface Daoi {
    void login();
    void logout();
   public static void greet(){
       System.out.println("Password recreate");
   }
}
class Daoimpl implements Daoi{
    @Override
    public void login() {
        System.out.println("Login Successfully");
    }

    @Override
   public void logout() {
        System.out.println("logout Successfully");
    }

    public static void main(String[] args) {
       Daoi.greet();
        Daoi d1=new Daoimpl();
        d1.login();
        d1.logout();

    }
}