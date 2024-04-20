package functionalInterface;

public class empimpl {

        public void m1() {
            System.out.println("method m1 ");
        }

        public static void main(String[] args) {
        empimpl ag=new empimpl();

        emp a= ag::m1;
        a.m1();
    }
}
