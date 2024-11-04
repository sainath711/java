package java8.FI;
//@FunctionalInterface   restrict to keep a single abstract method
public interface TestOne {
    void login();
    void logout();
}
class TestImpl implements TestOne{
    @Override
    public void login() {
        System.out.println("Login Successfully");
    }

    @Override
    public void logout() {
        System.out.println("Logout Successfully");
    }

    public static void main(String[] args) {
         TestOne obj=new TestImpl();
         obj.login();
         obj.logout();
    }
}
