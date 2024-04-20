package java8.lamda;

public class emp1impl implements emp1{
    @Override
    public void emp_id() {
        System.out.println(101);
    }

    @Override
    public void emp_name() {
        System.out.println("sai");
    }

    public static void main(String[] args) {
        emp1 obj=new emp1impl();
        obj.emp_id();
        obj.emp_name();
    }
}
