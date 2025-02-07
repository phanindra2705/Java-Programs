import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        // Creating a LinkedList of Integers
        LinkedList<Integer> numbers = new LinkedList<>();

        // Adding elements to the LinkedList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Displaying the LinkedList
        System.out.println("LinkedList Elements: " + numbers);

        // Adding elements at first and last positions
        numbers.addFirst(5);
        numbers.addLast(60);
        System.out.println("After adding first(5) & last(60): " + numbers);

        // Accessing elements
        System.out.println("First Element: " + numbers.getFirst());
        System.out.println("Last Element: " + numbers.getLast());

        // Removing elements
        numbers.removeFirst(); // Removes 5
        numbers.removeLast();  // Removes 60
        System.out.println("After removing first & last: " + numbers);

        // Removing by index and value
        numbers.remove(2); // Removes the element at index 2
        numbers.remove(Integer.valueOf(20)); // Removes element with value 20
        System.out.println("After removing index 2 & value 20: " + numbers);

        // Checking if an element exists
        System.out.println("Contains 30? " + numbers.contains(30));

        // Sorting the LinkedList
        Collections.sort(numbers);
        System.out.println("Sorted LinkedList: " + numbers);

        // Iterating using a for-each loop
        System.out.print("Iterating through LinkedList: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Using Iterator for traversal
        System.out.print("Using Iterator: ");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Finding the size of the LinkedList
        System.out.println("Size of LinkedList: " + numbers.size());

        // Clearing all elements
        numbers.clear();
        System.out.println("LinkedList after clearing: " + numbers);
    }
}
