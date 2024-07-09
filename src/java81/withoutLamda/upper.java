package java81.withoutLamda;

public interface upper {
    public abstract String m1(String name);
}
class Upperimpl implements upper{
    @Override
    public String m1(String name) {
        return name.toUpperCase();
    }

    public static void main(String[] args) {
        upper up=new Upperimpl();

        System.out.println(up.m1("Rahul"));
    }
}
