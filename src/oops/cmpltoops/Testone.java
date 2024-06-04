package oops.cmpltoops;

public class Testone {
    public static void main(String[] args) {
        SavingsAccount SA=new SavingsAccount();
        SA.setAcc_id(101);
        SA.setAcc_name("RAHUL");
        SA.setAcc_bal(30000);
        SA.cal_Bal();
        System.out.println(SA.getMin_bal());
        System.out.println(SA.getAcc_id());
        System.out.println(SA.getAcc_name());
        System.out.println(SA.getAcc_bal());
        System.out.println(SA.cal_Bal());


        CurrentAccount CA=new CurrentAccount();
        CA.setAcc_id(102);
        CA.setAcc_name("SONIA");
        CA.setAcc_bal(20000);
        CA.cal_Bal();
        System.out.println(CA.getMin_bal());
        System.out.println(CA.getAcc_id());
        System.out.println(CA.getAcc_name());
        System.out.println(CA.getAcc_bal());
        System.out.println(CA.cal_Bal());
        AccountService.get_Service(SA);
        AccountService.get_Service(CA);
    }
}
