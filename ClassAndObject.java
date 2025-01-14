// Define the Student class
class Student {
    // Attributes (fields)
    String name;
    int age;
    String course;

    // Constructor to initialize the student object
    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main class to test the Student class
public class ClassAndObject {
    public static void main(String[] args) {
        // Create objects of the Student class
        Student student1 = new Student("Alice", 20, "Computer Science");
        Student student2 = new Student("Bob", 22, "Data Engineering");

        // Call methods on the objects
        System.out.println("Details of Student 1:");
        student1.displayDetails();

        System.out.println("\nDetails of Student 2:");
        student2.displayDetails();
    }
}

