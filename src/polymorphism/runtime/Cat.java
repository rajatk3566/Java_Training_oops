package polymorphism.runtime;

public class Cat extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
