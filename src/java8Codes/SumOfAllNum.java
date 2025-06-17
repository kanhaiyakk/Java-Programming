package java8Codes;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class SumOfAllNum {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,15,20,20,25);
        int sum=list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //using reduce method
        Optional<Integer> sum1=list.stream()
                        .reduce((a,b)->a+b);
        System.out.println(sum1.get());
    }
}
