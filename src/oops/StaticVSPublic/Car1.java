package oops.StaticVSPublic;

public class Car1 {
    public void model(){
        System.out.println("New car");
    }
    public int Speed(int MaxSpeed){
        return MaxSpeed;
    }

    public static void main(String[] args) {
      Car1  obj=new Car1();
      obj.model();
        System.out.println("Max speed of this car is: "+obj.Speed(200));
    }
}
