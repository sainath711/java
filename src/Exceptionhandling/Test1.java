package Exceptionhandling;

public class Test1 {
    public static void m1(){
     m2();
    }
    public static void m2(){
        System.out.println(10/5);
        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException ae){
           //System.out.println(10/1);
            ae.printStackTrace();
            System.out.println(ae);
            //System.out.println(ae.toString());
            System.out.println(ae.getMessage());
        }

        System.out.println(10/2);
    }
    public static void m3(){
        m2();
    }

    public static void main(String[] args) {
        m1();
    }
}
