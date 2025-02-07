import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");
        fruits.add("Orange");

        // Displaying the ArrayList
        System.out.println("ArrayList Elements: " + fruits);

        // Accessing an element
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating using a for-each loop
        System.out.print("Iterating through ArrayList: ");
        for (String fruit : fruits) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        // Sorting the ArrayList
        Collections.sort(fruits);
        System.out.println("Sorted ArrayList: " + fruits);

        // Checking if an element exists
        System.out.println("Contains 'Apple'? " + fruits.contains("Apple"));

        // Using Iterator to traverse
        System.out.print("Using Iterator: ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Finding the size of the ArrayList
        System.out.println("Size of ArrayList: " + fruits.size());

        // Clearing all elements
        fruits.clear();
        System.out.println("ArrayList after clearing: " + fruits);
    }
}
