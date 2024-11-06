package java8.lamda;

//With Lambda
interface One{
    int Sqr(int num);
}
public class Square {
    public static void main(String[] args) {
         One obj=(num)->num*num;{
            System.out.println(obj.Sqr(10));
            System.out.println(obj.Sqr(4));
        }


    }
}
