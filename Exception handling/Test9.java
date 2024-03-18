class InsuffientFundsException extends Exception{
    InsuffientFundsException(String msg){
        super(msg);
    }    
}
class Account{
    public static void withdrawl(int amount) throws InsuffientFundsException{
        int bal=500;
        if(bal < amount){
            throw new InsuffientFundsException("No Money Buddy");
        }
        else{
            System.out.println("Withdrawl Money and enjoy");
        }
    }
    public static void main(String[] args) throws InsuffientFundsException {
        System.out.println(10/2);
        withdrawl(1500);
        System.out.println("GE");

    }
}