package methods.recursion;

public class factorialex {
    static int m1(int x){
        if (x==0 || x==1 ){
            return 1;
        }
        else {
            int product=1;
            for (int i = 1; i <=x; i++) {
                product *=i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x=4;
        System.out.println(m1(x));
    }
}
