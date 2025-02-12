import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Adding key-value pairs
        studentMap.put(101, "John");
        studentMap.put(102, "Emma");
        studentMap.put(103, "Oliver");
        studentMap.put(104, "Sophia");

        // Retrieving a value by key
        System.out.println("Student with ID 102: " + studentMap.get(102));

        // Checking if a key exists
        if (studentMap.containsKey(105)) {
            System.out.println("Student with ID 105 exists.");
        } else {
            System.out.println("Student with ID 105 not found.");
        }

        // Checking if a value exists
        if (studentMap.containsValue("Emma")) {
            System.out.println("Emma is present in the student map.");
        }

        // Iterating over HashMap using entrySet
        System.out.println("\nList of all students:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Removing an entry
        studentMap.remove(103);
        System.out.println("\nAfter removing ID 103:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // Getting the size of the HashMap
        System.out.println("\nTotal students: " + studentMap.size());

        // Clearing all elements
        studentMap.clear();
        System.out.println("\nAfter clearing, is the HashMap empty? " + studentMap.isEmpty());
    }
}
