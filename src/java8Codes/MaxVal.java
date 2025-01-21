package java8Codes;

import java.util.Arrays;
import java.util.List;

//How can you find the maximum or minimum value in a list of integers using streams?
public class MaxVal {
    public static void main(String[] args) {
        List<Integer> arrList= Arrays.asList(102,111,11,991,13,187,66,99);
        int maxVal=arrList.stream().max(Integer::compare).get();
        System.out.println(maxVal);
        int minVal=arrList.stream().min(Integer::compareTo).get();
        System.out.println(minVal);
    }
}
