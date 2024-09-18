package oops.StaticVSPublic;

public class ex {
    static void MystaticMethod(){
        System.out.println("Static method can execute without creating object");
    }
    public void MyPublicmethod(){
        System.out.println("Public methods we have to create object");
    }

    public static void main(String[] args) {
        MystaticMethod();
        //MyPublicmethod(); it compiles an error so we have to create object for public methods
        ex obj=new ex();
        obj.MyPublicmethod();
    }
}
