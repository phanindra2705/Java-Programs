// Define the Employee class with encapsulation
class Employee {
    // Private fields (data hiding)
    private String name;
    private int age;
    private double salary;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // Validation
            this.age = age;
        } else {
            System.out.println("Invalid age. Please enter a positive value.");
        }
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary > 0) { // Validation
            this.salary = salary;
        } else {
            System.out.println("Invalid salary. Please enter a positive value.");
        }
    }
}

// Main class to test encapsulation
public class Encapsulation {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee emp = new Employee();

        // Set values using setter methods
        emp.setName("John Doe");
        emp.setAge(30);
        emp.setSalary(75000.50);

        // Get and display values using getter methods
        System.out.println("Employee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: $" + emp.getSalary());
        
        
    }
}