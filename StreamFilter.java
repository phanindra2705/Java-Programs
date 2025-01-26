import java.util.*;
import java.util.stream.*;

public class StreamFilter {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 35);

        // Filter numbers greater than 20
        List<Integer> filteredNumbers = numbers.stream()
                                               .filter(n -> n > 20)
                                               .collect(Collectors.toList());

        System.out.println("Filtered Numbers: " + filteredNumbers);
    }
}
