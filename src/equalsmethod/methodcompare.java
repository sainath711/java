package equalsmethod;

public class methodcompare {
    public static void main(String[] args) {
       String s1=new String("Rahul");
       String s2="Rahul";
       String s3="Rahul";
       String s4=new String("Rahul");

       //for String equals method is content comparision and for objects reference comparision
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s4));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s2.equals(s3));//true

    }
}
