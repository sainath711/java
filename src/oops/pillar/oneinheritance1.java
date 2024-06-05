package oops.pillar;

public class oneinheritance1 extends onencapsul{
    private int age;
    private int tax;

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int cal_sal(){
            int gross_sal=this.getSal()-this.getSal()/100*this.getTax();
            return gross_sal;
        }
    }

