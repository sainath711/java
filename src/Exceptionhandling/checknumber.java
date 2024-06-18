package Exceptionhandling;

public class checknumber {
    public static void main(String[] args) {
        System.out.println(10/5);
        try {
            System.out.println(10 / 0);
        }
        catch (ArithmeticException e){
            System.out.println(10/2);
        }
        System.out.println(10/1);
    }
}
