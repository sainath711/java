package langpack;
class A{}
class B extends A{}
public class Test {
    public static void main(String[] args) {
        A a=new A();
        B b=new B();
        String s1="Rahul";
        String s2="sonia";
        String s3="Rahul";
        int id1=100;
        int id2=200;
        int id3=100;
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s2));
        System.out.println(s1==s3);
        System.out.println(id1==id3);
    }
}
