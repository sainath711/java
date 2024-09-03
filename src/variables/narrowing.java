package variables;

public class narrowing {
    public static void main(String[] args) {
        float f=10.4f;
        //int b=f; compile time error
        int a=(int)f;//Narrowing (Typecasting)
        System.out.println(f);
        System.out.println(a);

    }
}
