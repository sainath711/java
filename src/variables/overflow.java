package variables;

public class overflow {
    public static void main(String[] args) {
        int a=32768;
        short b=(short) a;
        System.out.println(a);
        System.out.println(b);
    }
}
