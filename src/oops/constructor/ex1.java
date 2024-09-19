package oops.constructor;

public class ex1 {
    int emp_id;
    String e_name;
    ex1(int id,String name){
        this.emp_id=id;
        this.e_name=name;
    }

    public static void main(String[] args) {
        ex1 obj=new ex1(101,"Sainath");
        System.out.println(obj.emp_id);
        System.out.println(obj.e_name);
    }
}
