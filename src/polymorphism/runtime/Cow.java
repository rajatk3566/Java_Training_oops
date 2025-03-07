package polymorphism.runtime;

public class Cow extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Moo");
    }
}