package Practice.Oops.Encapsulation;

public class Student {
    private int Age;

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        if(Age<=0){
            System.out.println("Invalid Age");
        }else {
            Age = age;
        }

    }

   private String Name;
    private int RollNumber;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNumber() {
        return RollNumber;
    }

    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }
}
