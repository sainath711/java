package java8.predefinedFI;
interface function1{
    int apply(String name);
}
public class functionimpl1 {
    public static void main(String[] args) {
        function1 f=name -> name.length();
        System.out.println(f.apply("Dasari sainath"));
    }
}
