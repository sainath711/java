package java8.lamda;
interface Three{
    public abstract int sum(int num1,int num2);
}
class Add {
    public static void main(String[] args) {
        Three obj=(num1,num2)->num1+num2;{
            System.out.println(obj.sum(10,20));
        }

    }
}
