package java8Codes.New;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class SecondLargest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 3, 5, 2, 4, 3, 2, 6, 6);
        int secondLargest=numbers.stream()
                        .distinct()
                                .sorted(Collections.reverseOrder())
                                        .skip(1)
                                                .findFirst()
                                                        .orElse(-1);

        System.out.println(secondLargest);
    }
}
