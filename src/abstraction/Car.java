package abstraction;

public class Car extends Vehicle{
    // need to override  method of abstract class

    @Override
    public void speed() {
        System.out.println("Car is Speeding...");
    }
}
