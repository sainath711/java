package java8.predefinedFI;
interface Five{
    int findLength(String ename);
}
public class FunctionUser {
    public static void main(String[] args) {
        Five obj=ename -> ename.length();
        System.out.println(obj.findLength("rahul"));
    }
}
