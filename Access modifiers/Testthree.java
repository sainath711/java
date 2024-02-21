abstract class Bank{
    
    public abstract void cal_Bal();

    public String get_Branch_Name(){
        return "Marathahalli";
    }
}
class Account extends Bank{
    public void cal_Bal(){
        System.out.println("cal_Bal impl");
    }
     public static void main(String[] args){
        Account obj=new Account();
        obj.cal_Bal();
        System.out.println(obj.get_Branch_Name());
    }
}