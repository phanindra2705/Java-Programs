@FunctionalInterface
interface Calculator {
    int operate(int a, int b); // Single abstract method
}

public class LambdaExpression {

    public static void main(String[] args) {
        // Lambda for addition
        Calculator add = (a, b) -> a + b;
        System.out.println("Addition: " + add.operate(10, 5));

        // Lambda for subtraction
        Calculator subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.operate(10, 5));

        // Lambda for multiplication
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.operate(10, 5));

        // Lambda for division
        Calculator divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
            return a / b;
        };
        System.out.println("Division: " + divide.operate(10, 5));
    }
}

