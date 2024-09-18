package oops.StaticVSPublic;

public class Car {
    public void model(){
        System.out.println("This car model is 2023");
    }
    public void speed(int maxSpeed){

        System.out.println("Car maximum Speed is: "+ maxSpeed);
    }

    public static void main(String[] args) {
        Car obj=new Car();
        obj.model();
        obj.speed(200);

    }
}
