package CollectionsCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinPrefixSuffixDelimeter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        String strList =stringList.stream().collect(Collectors.joining("," , "[" , "]"));
        System.out.println(strList);
    }
}
