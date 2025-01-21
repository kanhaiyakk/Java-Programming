package CollectionsCode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        List<String> uniqueStream = stringList.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueStream);
    }
}
