import abstraction.Car;
import encapsulation.BankAccount;
import inheritance.Dog;
import polymorphism.compiletime.PrintSomething;
import polymorphism.runtime.Animals;
import polymorphism.runtime.Cat;
import polymorphism.runtime.Cow;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Encapsulation
        BankAccount en = new BankAccount();
        en.deposit(200);
        System.out.println(en.getBalance());

        // Inheritance
        //Created instance of dog class but able to access the methods of Animal class also;
        Dog an = new Dog();
        an.eat();
        an.bark();

        // Abstraction
        Car car  = new Car();
        car.start();
        car.speed();

        // Polymorphism
        // compiletime
        PrintSomething pt = new PrintSomething();
        pt.print(2021);
        pt.print("Rajat Kumar");


        // Runtime
        // Taking reference of parent class but creating object of child class
        Animals a = new Cat();
        Animals b = new Cow();
        a.makeSound();
        b.makeSound();
    }
}