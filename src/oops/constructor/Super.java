package oops.constructor;

class Account2 {
    Account2(String name, String email) {
        super();
        System.out.println("Account cls constructor");
    }
}

class Account1 extends Account2 {
    Account1(int id, String name, String email) {
        super(name, email);
        System.out.println("Account1 cls constructor");
    }
}

class Demo {
    public static void main(String[] args) {
        Account1 A1 = new Account1(101, "sai", "sai@123gmail.com");
//        A1.id();
//        A1.name();
//        A1.email();
    }
}