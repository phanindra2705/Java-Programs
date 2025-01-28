@FunctionalInterface
interface Greeting {
    void sayHello(String name); // Single abstract method
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        // Using a lambda expression
        Greeting greeting = (name) -> System.out.println("Hello, " + name + "!");
    }
}


// Without Lambda Expression
// @FunctionalInterface
// interface Greeting {
//     void sayHello(String name); // Single abstract method
// }

// public class FunctionalInterfaceExample {
//     public static void main(String[] args) {
//         // Implementing the functional interface without lambda
//         Greeting greeting = new Greeting() {
//             @Override
//             public void sayHello(String name) {
//                 System.out.println("Hello, " + name + "!");
//             }
//         };

//         greeting.sayHello("Phanindra");
//     }
// }
