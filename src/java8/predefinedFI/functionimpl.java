package java8.predefinedFI;
interface function{  //without lamda and user defined functionalInterface
    int apply(String name);
}
public class functionimpl implements function {
    @Override
    public int apply(String name) {
        return name.length();
    }

    public static void main(String[] args) {
        function f=new functionimpl();
        System.out.println(f.apply("sainath"));
    }
}
