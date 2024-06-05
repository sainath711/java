package oops.pillar2;

public class PE extends employee{
    private String loc;
    private int tax;
    private int sal;

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public PE(int id, String name, int sal, String loc){
        super(id, name);
        this.loc=loc;
        this.sal=sal;
    }
    @Override
    public int cal_sal() {
        int gross_sal=this.sal-this.sal/100*this.getTax();
        return gross_sal;
    }
}
