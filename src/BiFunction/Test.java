package BiFunction;

public class Test {
    public static void main(String[] args) {
        ex1 obj=(fn,ln)->(fn+ln).length();
        System.out.println(obj.apply("Rahul","Gandhi"));
    }
}
