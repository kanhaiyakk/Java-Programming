package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerFN {
    public static void main(String[] args) {
        //Add delimiter in the string
        StringJoiner sj=new StringJoiner(",");
        sj.add("A").add("B").add("C").add("D");
        System.out.println(sj);

        // Add prefix and Suffix in the string
        StringJoiner sj1=new StringJoiner(",","[","]");
        sj1.add("One").add("Two").add("Three");

        System.out.println(sj1);
        //merge both result

        sj.merge(sj1);
        System.out.println(sj);

        // | Delimiter
        List<String> list = Arrays.asList("Red", "Green", "Blue");

        String result = list.stream().collect(Collectors.joining(" | ","{ "," }"));

        System.out.println(result);
    }
}
