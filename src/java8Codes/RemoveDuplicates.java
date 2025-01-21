package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//How would you remove duplicate elements from a list using streams?
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> arrList= Arrays.asList(12,12,15,14,14,15,18,19,17,13);
        List<Integer> distinctList=arrList.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);
    }
}
