package Exceptionhandling;

public class AE {
    public static void main(String[] args) {
        //System.out.println(10/0); Arithmetic Exception
        try {
            System.out.println(10/0);
        }
        catch ( Exception e){
            System.out.println(10/5);
        }
    }
}
