package methods.recursion;

public class ex2 {
    public static void main(String[] args) {
        int result=sum(5,10);
        System.out.println(result);
    }
    public static int sum(int a,int b){
        if (b>a){
            return b+sum(a,b-1);
        }
        else {
            return a;
        }
    }
}
