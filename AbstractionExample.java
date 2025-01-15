// Abstract class
abstract class Vehicle {
    // Abstract method (no implementation)
    abstract void start();

    // Concrete method (with implementation)
    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}

// Concrete subclass
class Car extends Vehicle {
    // Implement the abstract method
    @Override
    void start() {
        System.out.println("Car is starting.");
    }
}

// Another concrete subclass
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting.");
    }
}

public class AbstractionExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();

        Vehicle bike = new Bike();
        bike.start();
        bike.stop();
    }
}

