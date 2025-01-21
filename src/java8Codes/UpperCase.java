package java8Codes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//How would you convert all strings in a list to uppercase using streams?
public class UpperCase {
    public static void main(String[] args) {
        List<String> strList= Arrays.asList("Kanhaiya","Aman","Rukmini","Sunny","Kk","Shashi");
        List<String> upperCase= strList.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> lowerCase=strList.stream().map(String::toLowerCase).toList();
        System.out.println(upperCase);
        System.out.println(lowerCase);
    }
}
