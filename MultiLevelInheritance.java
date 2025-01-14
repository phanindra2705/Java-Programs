// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Intermediate class
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Derived class
class SportsCar extends Car {
    void race() {
        System.out.println("Sports car is racing.");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        SportsCar sportsCar = new SportsCar();
        sportsCar.start(); // From Vehicle class
        sportsCar.drive(); // From Car class
        sportsCar.race();  // From SportsCar class
    }
}

