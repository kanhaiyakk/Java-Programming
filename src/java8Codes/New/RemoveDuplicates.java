package java8Codes.New;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(5,8,9,15,15,12,8,5);
        //List of Duplicates Elements
        Set<Integer> seen=new HashSet<>();
        List<Integer> duplicates=integerList.stream()
                .filter(i->!seen.add(i))
                .toList();
        System.out.println(duplicates);
        //List of Distinct Elements
//        List<Integer> distinctList=integerList.stream()
//                .map(i->i).distinct().toList();
//        System.out.println(distinctList);
    }
}
