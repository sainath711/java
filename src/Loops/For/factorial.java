package Loops.For;

public class factorial {
    public static void main(String[] args) {
//        int n=6;
//        int res=1;
//        while (n>0){
//            res=res*n;
//            n--;
//        }
//        System.out.println(res);
        int n= 6; // number to calculate factorial for
        long res= 1; // to store factorial value

        // loop to calculate factorial
        for(int i = 1; i <= n; ++i) {
            res*= i;
        }

        System.out.println("Factorial of " + n + " is: " + res);
    }
}
