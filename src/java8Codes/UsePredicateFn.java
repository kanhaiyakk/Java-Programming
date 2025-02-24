package java8Codes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UsePredicateFn {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie", "David"));

        // Predicate to remove names starting with 'A'
        Predicate<String> isStartWithA= s -> s.startsWith("A");
        // Remove elements matching the predicate
        names.removeIf(isStartWithA);
        System.out.println(names);

    }
}
