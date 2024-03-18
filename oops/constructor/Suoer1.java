class Account{
    Account(String n,String e){
        //super();
        System.out.println("Account class constr");
    }
}
class SA extends Account{
    SA(int id,String name,String email,int amount){
        super(name,email);
        System.out.println("SA class Constrctor");
    }
}
class SuperEx{
    public static void main(String[] args){
        new SA(101,"Rahul","rg@gmail.com",45000);
      
    }
}