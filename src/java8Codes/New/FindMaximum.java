package java8Codes.New;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximum {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(5,8,9,17,15,12,3,4);
//        int max=integerList.stream()
//                .max(Integer::compare) //use Integer::compareTo
//                .orElseThrow();   //throws exception if list is empty

//        int max=integerList.stream()
//                        .mapToInt(i->i).max().orElseThrow();
        //System.out.println(max);

        // Using Stream + max()
        Optional<Integer> max = integerList.stream().max(Integer::compareTo);

        max.ifPresent(value -> System.out.println("Max value: " + value));
    }
}
