package Loops;
//count a number
public class count {
    public static void main(String[] args) {
        int n=2345;
        int res=0;
        while (n>0){
            n=n/10;
            res++;
        }
        System.out.println(res);

    }
}
