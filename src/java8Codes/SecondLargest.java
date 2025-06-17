package java8Codes;

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={12,15,48,90,5,6};
        OptionalInt secondLargest=Arrays.stream(arr)
                .distinct()
                .sorted()
                .skip(arr.length-2)
                .findFirst();
        System.out.println(secondLargest.orElse(0));
//        List<Integer> list=Arrays.asList(12,15,48,90,5,6);
//         Optional<Integer> secondLargest=list.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(1)
//                .findFirst();
//        System.out.println("Second largest element: " + secondLargest.orElse(null));
    }
}
