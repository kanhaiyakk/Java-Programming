package java8Codes.New;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstChar {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("apple","banana","avocado","blueberry");
        Map<Character,List<String>> result=list.stream()
                .collect(Collectors.groupingBy(s->s.charAt(0)));
        System.out.println(result);
    }
}
