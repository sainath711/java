package java81.Function;

public interface fun {
    public abstract String m1(String name);
}
class funImpl{
    public static void main(String[] args) {
        fun up=name -> name.toUpperCase();
        System.out.println(up.m1("Rahul"));
    }
}
