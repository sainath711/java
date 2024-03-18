class InsuffientFundsException extends Exception{
    InsuffientFundsException(String msg){
        super(msg);
    }    
}
class Account{
    public static void withdrawl(int amount) {
		
        int bal=500;
		
        if(bal < amount){
            try{
                throw new InsuffientFundsException("No Money Buddy");
            }
            catch(InsuffientFundsException obj){
               System.out.println(obj.getMessage());
            }
            
        }
        else{
            System.out.println("Withdrawl Money and enjoy");
        }
    }
    public static void main(String[] args){
		withdrawl(1500);
		try{
        System.out.println(10/0);
		}
		catch(Exception e){
        
        System.out.println(10/2);
		}
		

    }
}