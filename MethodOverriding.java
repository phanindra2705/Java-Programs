// Parent class
class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

// Child class
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

// Another child class
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Shape shape1 = new Circle();     // Polymorphism
        Shape shape2 = new Rectangle();  // Polymorphism

        shape1.draw(); // Calls Circle's draw method
        shape2.draw(); // Calls Rectangle's draw method
    }
}
