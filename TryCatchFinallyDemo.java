import java.util.Scanner;

public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Take two numbers as input
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Perform division
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");

        } catch (Exception e) {
            // Handle other exceptions
            System.out.println("An unexpected error occurred: " + e.getMessage());

        } finally {
            // Close the scanner and execute cleanup
            System.out.println("Finally block executed. Closing resources...");
            scanner.close();
        }
        
        System.out.println("Program completed.");
    }
}
