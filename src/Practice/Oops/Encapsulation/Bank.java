package Practice.Oops.Encapsulation;

public class Bank {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        bankAccount.deposit(-10);
        bankAccount.withdraw(10);
        bankAccount.deposit(100);
        bankAccount.withdraw(10);
        System.out.println(bankAccount.getBalance());
    }
}
