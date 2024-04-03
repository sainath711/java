package oops;

public class employee extends User{
    private int emp_id;
    private String emp_name;
    private double emp_salary;

    public int getemp_id() {
        return emp_id;
    }

    public void setemp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getemp_name() {
        return emp_name;
    }

    public void setemp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public double getemp_salary() {
        return emp_salary;
    }

    public void setemp_salary(double emp_salary) {
        this.emp_salary = emp_salary;
    }


    public void emp() {
    }
}
