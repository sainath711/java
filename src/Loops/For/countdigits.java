package Loops.For;

public class countdigits {
    public static void main(String[] args) {
        int num=0;
        int i=46734633;
        while (i>0){
           i=i/10;
           num++;
        }
        System.out.println(num);
    }
}
