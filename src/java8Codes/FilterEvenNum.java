package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNum {
    public static void main(String[] args) {
        List<Integer> arrList= Arrays.asList(1,2,3,4,5,6,8,7,12,16,18,21,27,25);
        List<Integer> evenNum=arrList.stream().filter( i -> i%2==0).collect(Collectors.toList());
        System.out.println(evenNum);
        List<Integer> oddNum=arrList.stream().filter(i -> i%2 != 0).collect(Collectors.toList());
        System.out.println(oddNum);
    }
}
