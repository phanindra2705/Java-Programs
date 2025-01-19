import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(10, 5, 20, 15, 25, 30, 5, 10);

        System.out.println("Original List: " + numbers);

        // 1. Filter: Get only numbers greater than 10
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n > 10)
                .collect(Collectors.toList());
        System.out.println("Filtered (greater than 10): " + filteredNumbers);

        // 2. Map: Multiply each number by 2
        List<Integer> mappedNumbers = numbers.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        System.out.println("Mapped (multiplied by 2): " + mappedNumbers);

        // 3. Sort: Sort the numbers in ascending order
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted: " + sortedNumbers);

        // 4. Distinct: Remove duplicate elements
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Distinct: " + distinctNumbers);

        // 5. Reduce: Calculate the sum of all numbers
        int sum = numbers.stream()
                .reduce(0, Integer::sum); // 0 is the identity value
        System.out.println("Sum: " + sum);

        // 6. Count: Count numbers greater than 10
        long count = numbers.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println("Count (greater than 10): " + count);
    }
}
