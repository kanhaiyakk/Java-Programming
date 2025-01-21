package CollectionsCode;

import java.util.Arrays;
import java.util.List;

public class MultipleOf5 {
    public static void main(String[] args) {
        List<Integer> integerList= Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89, 55, 85, 9,65,95);
        integerList.stream().filter(i -> i%5 == 0).forEach(System.out::println);

        //Sorted output
       // integerList.stream().sorted().filter(i -> i%5==0).forEach(System.out::println);

        //Reversed sorted output
        //integerList.stream().sorted(Comparator.reverseOrder()).filter(i -> i%5==0).forEach(System.out::println);
    }
}
