package equalsmethod;

public class equalOprt {
    public static void main(String[] args) {
        String s1=new String("Rahul");//object
        String s2="Rahul";//primitive
        String s3="Rahul";
        String s4=new String("Rahul");

        //equal operator(==)  for objects is reference comparision, and for primitives is content comparision
        System.out.println(s1==s2);//false
        System.out.println(s1==s4);//false
        System.out.println(s2==s3);//true
        System.out.println(s4==s2);//false
    }
}
