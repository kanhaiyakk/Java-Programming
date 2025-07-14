package java8Codes.New;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequency {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","avocado","blueberry","apple");
        Map<String,Long> freq=list.stream()
                .collect(Collectors.groupingBy(s-> s,Collectors.counting()));
        System.out.println(freq);
    }
}
