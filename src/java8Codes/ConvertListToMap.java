package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListToMap {
    public static void main(String[] args) {
       // List<String > list= Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
//        Map<String,Integer> map= list.stream()
//                .collect(Collectors.toMap(
//                        str -> str,
//                        str -> 1,
//                        Integer::sum
//                ));
//        System.out.println(map);

        //String as key, length as value
        List<String > list= Arrays.asList("apple", "banana", "orange");
        Map<String,Integer> lengthMap=list.stream()
                .collect(Collectors.toMap(
                        str -> str,
                        String::length
                ));
        System.out.println(lengthMap);
    }
}
