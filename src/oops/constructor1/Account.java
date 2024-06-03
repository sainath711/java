package oops.constructor1;

public class Account {
    int id;
    String name;
    Account(int eid,String ename){
        this.id=eid;
        this.name=ename;
    }



    public static void main(String[] args) {
        Account a1=new Account(101,"sainath");
        System.out.println("id:"+a1.id);
        System.out.println("name:"+a1.name);

    }
}
