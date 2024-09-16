package parameters;

public class condition {
    static void m1(int age){
        if (age>18){
            System.out.println("Yes u r eligible");
        }
        else {
            System.out.println("No u r not eligible");
        }
    }

    public static void main(String[] args) {
       // m1(10);
        m1(19);
    }
}
