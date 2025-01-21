package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWithA {
    public static void main(String[] args) {
        List<String> arrStr= Arrays.asList("Aman","kanh","Rukmini","Sunny","akash","Ashiq");
        List<String > startWith= arrStr.stream()
                .filter(word -> word.startsWith("A")|| word.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(startWith);
    }
}
