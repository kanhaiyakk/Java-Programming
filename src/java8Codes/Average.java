package java8Codes;

import java.util.Arrays;
import java.util.List;

public class Average {
    public static void main(String[] args) {
        List<Integer> arrList= Arrays.asList(5,10,15,20);
        double avg=arrList.stream()
                .mapToInt(e->e).average().getAsDouble();
        System.out.println(avg);
    }
}
