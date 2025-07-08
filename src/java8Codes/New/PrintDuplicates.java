package java8Codes.New;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicates {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,1,2,4);
        Set<Integer> seen=new HashSet<>();
        List<Integer> result=list.stream()
                .filter(i-> !seen.add(i))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
