package java81.Consumer;
//Raising Null pointer Exception and by using try and catch we are executing GM
public class TestTwo {
    public static void main(String[] args) {

        try {
            String ename=null;
            System.out.println(ename.length());
        }
        catch (NullPointerException e){

        }

        System.out.println("GM");
    }
}
