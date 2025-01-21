package CollectionsCode;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOfEachChar {
    public static void main(String[] args) {
        String s= "My name is kanhaiya kumar sha";
        Map<Character, Long> countCharMap = s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countCharMap);
    }
}
