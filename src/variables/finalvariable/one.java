package variables.finalvariable;

public class one {
    public static void main(String[] args) {
        int a=10;
        a=20;
        System.out.println(a);
        final int b=30;
        //b=40; we can't change the final values
        System.out.println(b);
    }
}
