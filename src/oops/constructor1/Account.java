package oops.constructor1;

public class Account {
    int id;
    String name;
    Account(int id,String name){
        this.id=id;
        this.name=name;
    }
    public void m1(){}
    public int ammount(){
        return 0;
    }

    public static void main(String[] args) {
        Account a1=new Account(101,"sainath");
        System.out.println("id:"+a1.id+"  name:"+a1.name);
    }
}
