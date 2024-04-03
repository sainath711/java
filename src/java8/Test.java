package java8;

abstract class  one{
    public abstract void m1();
}
class Two extends one{
    public void m1(){
        System.out.println("hi frnds");
    }
}
 class Test{
    public static void main(String[] args){
       Two d=new Two();
       d.m1();
    }
}