package java8.predefinedFI;
@FunctionalInterface
interface Six{
    int findLength(String ename);
}
 public class FunctionNormal implements Six{
    public int findLength(String ename){
        return ename.length();
    }

    public static void main(String[] args) {
        Six obj=new FunctionNormal();
        System.out.println(obj.findLength("Rahul"));

    }
}
