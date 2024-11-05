package java8.lamda;

//With Lamda
interface One{
    int Sqr(int num);
}
public class Square {
    public static void main(String[] args) {
         One obj=(num)->num*num;{
            System.out.println(obj.Sqr(10));
        }


    }
}
