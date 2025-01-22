package oops.encapsulation.encap;

public class Test {
    public static void main(String[] args) {
        Student std=new Student();
        std.age=12;
        std.setName("Sai");
        std.rollnumber=14;
        System.out.println(std.getName());
    }
}
