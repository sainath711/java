package interface2.muitipleInheritance;

public class Cat implements Animal,Dog{
    @Override
    public void Eat() {
        System.out.println("Dog can eat");
    }

    @Override
    public void Run() {
        System.out.println("Dog can Run");
    }

    @Override
    public void Jump() {
        System.out.println("Dog can jump");
    }
}
