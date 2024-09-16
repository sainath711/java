package methods.methodOverloading;

public class main {
    static int m1(int x,int y){
        return x+y;
    }
    static double m1(double x,double y){
        return x+y;
    }

    public static void main(String[] args) {

//        System.out.println(m1(10,20));
//        System.out.println(m1(10.12,20.21));
        int myNum1=m1(10,20);
        double myNum2=m1(10.06,20.60);
        //m1 method is overloaded into int and double
        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}
