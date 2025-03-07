package abstraction;

public abstract class Vehicle {

    //method declared inside the abstract class
    public  void  start(){
        System.out.println("Vehicle is starting....");
    };

    // Doesnt have body
     abstract void speed();

}
