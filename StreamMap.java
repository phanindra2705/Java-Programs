import java.util.*;
import java.util.stream.*;

public class StreamMap {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("alice", "bob", "charlie");

        // Convert names to uppercase
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println("Uppercase Names: " + upperCaseNames);
    }
}

