package Loops;

public class factorial {
    public static void main(String[] args) {
        int n=6;
        int res=1;
        while (n>0){
            res=res*n;
            n--;
        }
        System.out.println(res);
    }
}
