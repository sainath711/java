package functionalInterface;

public class calc1Impl implements calc1{



        @Override
        public int sum (int a,int b) {
            return (a+b);

        }
    public static void main(String[] args) {
            calc1 c2=new calc1Impl();
        System.out.println(c2.sum(10,20));
    }
}
