package Practice.Oops.Encapsulation;

public class Test {
    public static void main(String[] args) {
        Student Std=new Student();
        Std.setAge(-24);
        Std.setName("Sainath");
        Std.setRollNumber(42);
        System.out.println(Std.getAge());
    }
}
