package oops.pillar;

public class onemain {
    public static void main(String[] args) {
        oneinheritance1 one=new oneinheritance1();
        one.setId(101);
        one.setName("Rahul gandhi");
        one.setAge(50);
        one.setSal(45000);
        System.out.println(one.getName());
            oneinheritance2 two=new oneinheritance2();
            two.setId(102);
            two.setName("Sonia gandhi");
            two.setAge(75);
            two.setSal(55000);
        System.out.println(two.getName());
        onepoly.m2(one);
        onepoly.m2(two);
    }
}
