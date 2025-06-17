package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class     UsePredicateFn1 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 25, 30, 45, 50);

        Predicate<Integer> isEven= i->i%2==0;

        List<Integer> filteredRes=numbers.stream().filter(isEven).collect(Collectors.toList());
        System.out.println(filteredRes);
    }
}
