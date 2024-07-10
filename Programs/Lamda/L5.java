package Lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class L5 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // Using lambda to map names to uppercase
        List<String> upperCaseNames = names.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println(upperCaseNames);  // Output: [ALICE, BOB, CHARLIE]
    }
}
