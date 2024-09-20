package oops.encapsulation;

public class carTest {
    public static void main(String[] args) {

            car obj=new car();
          // obj.colour="Black";
        obj.setColour("Black");
            obj.model="Benz";
            obj.year=2024;
            System.out.println(obj.getColour());


    }
}
