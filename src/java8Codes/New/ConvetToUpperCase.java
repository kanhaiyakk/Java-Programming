package java8Codes.New;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvetToUpperCase {
    public static void main(String[] args) {
        List<String > list= Arrays.asList("sunny", "Kanhaiya","shashi","Raja");
        List<String > convertedList=list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(convertedList);
    }
}
