package java8Codes.New;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TopThree {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(5,8,9,17,15,12,3,4);
        List<Integer> topThreeMaximum=integerList.stream()
                .sorted(Comparator.reverseOrder())   
                .limit(3)
                .toList();
        System.out.println(topThreeMaximum);
        //Skip first two element
//        List<Integer> skipFirstTwo=integerList.stream()
//                .skip(2)
//                .toList();
//        System.out.println(skipFirstTwo);
        //Top three element
//        List<Integer> topThree=integerList.stream()
//                .limit(3)
//                .toList();
//        System.out.println(topThree);
    }
}
