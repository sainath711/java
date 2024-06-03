package oops.cmpltoops;

public class Account extends Bank{
    private int acc_id;
   private String acc_name;
    private int acc_bal;

    public int getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(int acc_id) {
        this.acc_id = acc_id;
    }

    public String getAcc_name() {
        return acc_name;
    }

    public void setAcc_name(String acc_name) {
        this.acc_name = acc_name;
    }

    public int getAcc_bal() {
        return acc_bal;
    }

    public void setAcc_bal(int acc_bal) {
        this.acc_bal = acc_bal;
    }

    @Override
    public int cal_Bal() {
        return 0;
    }
}
