package variables;

public class widening {
    public static void main(String[] args) {
        int a=10;
        double d=a;
        float f=a; //int can convert  to float
        //int c=f; //float can't convert to int
         double b=f;


        System.out.println(a);
        System.out.println(f);
        System.out.println(b);
        System.out.println(d);
        //System.out.println(c);

    }
}
