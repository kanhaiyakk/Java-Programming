package java8Codes;

import java.util.Arrays;
import java.util.List;

public class FindFirst {
    public static void main(String[] args) {
        List<String> strList= Arrays.asList("Kanhaiya","aman","Rukmini","Sunny","kk","shashi");
        String names=strList.stream()
                .filter(word-> word.length()>4)
                .findFirst().orElse("Match not found");
        System.out.println(names);
    }
}
