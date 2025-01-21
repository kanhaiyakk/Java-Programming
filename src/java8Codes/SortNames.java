package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNames {
    public static void main(String[] args) {
        List<String> strList= Arrays.asList("Kanhaiya","Aman","Rukmini","Sunny","Kk","Shashi");
        List<String> sortedList=strList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
