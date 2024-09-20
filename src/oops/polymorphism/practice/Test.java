package oops.polymorphism.practice;

public class Test {
    public static void main(String[] args) {
        Animal dog=new Dog();
        dog.makeSound();

        Animal cat=new Cat();
        cat.makeSound();

        Animal animal=new Animal();
        animal.makeSound();
    }
}
