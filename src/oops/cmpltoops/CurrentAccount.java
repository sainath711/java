package oops.cmpltoops;

public class CurrentAccount extends Account{
    private int min_bal=10000;

    public int getMin_bal() {
        return min_bal;
    }

    public void setMin_bal(int min_bal) {
        this.min_bal = min_bal;

    }

    @Override
    public int cal_Bal() {
        int bal=this.getAcc_bal()-this.getMin_bal();
        return bal;
    }
}
