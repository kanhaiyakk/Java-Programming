package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertToMap2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date");

        Map<String,Integer> lengthMap=list.stream()
                .collect(Collectors.toMap(
                        str -> str,
                        String::length
                ));
        System.out.println(lengthMap);
    }
}
