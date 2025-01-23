package Practice.Oops.Encapsulation;

public class BankAccount {
    private long AccountNumber;
    private double Balance;

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public void deposit(double amount){
       if (amount>0){
           Balance +=amount;
           System.out.println("Deposited: "+ amount);

       }
       else {
           System.out.println("invalid Deposit Amount");
       }
    }

    public void withdraw(double amount){
        if (amount>0 && amount <=Balance){
            Balance -=amount;
            System.out.println("Withdrew" + amount);
        }
        else {
            System.out.println("Invalid Amount Or Insufficient balance");
        }

    }


}
