package oops.inheritance;

public class gp {
   public void m1(){
       System.out.println("grand parent class m1 method");
   }
}
class p extends gp{
    public void m2(){
        System.out.println("parent class m2 method");
    }
}
 class c extends p{
    public void m3(){
        System.out.println("child class m3 method");
    }

    public static void main(String[] args) {
         c c1=new c();
         c1.m1();
         c1.m2();
         c1.m3();
    }
}
