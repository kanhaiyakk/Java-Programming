package java8Codes;

import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

//How can you calculate the average of numbers greater than 50 in a list using streams?
public class AvgNum {
    public static void main(String[] args) {
        List<Integer> arrList=Arrays.asList(100,82,74,55,18,16,14);
//        double avg= arrList.stream()
//                .filter(i->i>50)
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();
       // System.out.println(avg);
        int[] arr={100,82,74,55,18,16,14};
        double avg= Arrays.stream(arr).filter(i->i>50).average().getAsDouble();
       System.out.println(avg);
    }
}
