package interface2.muitipleInheritance;

public class dogcat implements Animal,Dog,Cat {
    @Override
    public void Run() {
        System.out.println("Running");
    }

    @Override
    public void Eat() {
        System.out.println("Eating");
    }

    @Override
    public void catjump() {
        System.out.println("Cat will jump");
    }

    @Override
    public void dogJump() {
        System.out.println("Dog will jump");
    }
}
