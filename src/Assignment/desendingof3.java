package Assignment;

public class desendingof3 {
    public static void main(String[] args) {
        int a=300;
        int b=5000;
        int c=2000;
        if (a>b & a>c){
            System.out.println(a);
            if(b>c){
                System.out.println(b);
                System.out.println(c);
            }
            else {
                System.out.println(c);
                System.out.println(b);
            }
        }
        else if (b>a & b>c) {
            System.out.println(b);
            if (a>c){
                System.out.println(a);
                System.out.println(c);
            }
            else {
                System.out.println(c);
                System.out.println(a);
            }
        }
        else {
            System.out.println(c);
            if (a>b){
                System.out.println(a);
                System.out.println(b);
            }
            else {
                System.out.println(b);
                System.out.println(a);
            }
        }
    }
}
