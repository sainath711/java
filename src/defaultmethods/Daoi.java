package defaultmethods;

public interface Daoi{
    void login();
    void logout();
    public default void forgot_password(){
        System.out.println("Recreate the Password");
    }
}
