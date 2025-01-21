package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

//Group Numbers into Even and Odd:
//How can you use streams to group a list of integers into even and odd numbers?
public class SeperateOddEven {
    public static void main(String[] args) {
        List<Integer> arrList= Arrays.asList(21,13,15,41,18,17,19,12,15,22,24,28,20);
        Map<Boolean, List<Integer>> oddEven=arrList.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(oddEven);
//        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
//
//        Map<Boolean, List<Integer>> oddEvenNumbersMap =
//                listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
//
//        Set<Map.Entry<Boolean, List<Integer>>> entrySet = oddEvenNumbersMap.entrySet();
//
//        for (Map.Entry<Boolean, List<Integer>> entry : entrySet) {
//            System.out.println("--------------");
//
//            if (entry.getKey()) {
//                System.out.println("Even Numbers");
//            } else {
//                System.out.println("Odd Numbers");
//            }
//
//            System.out.println("--------------");
//
//            List<Integer> list = entry.getValue();
//
//            for (int i : list) {
//                System.out.println(i);
//            }
//        }
    }
}
