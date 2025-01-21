package java8Codes;

import java.util.Arrays;
import java.util.List;

//Using Java 8 find the sum of squares of all the odd numbers in the arraylist.
public class SumOfOddSquare {
    public static void main(String[] args) {


        List<Integer> arrList = Arrays.asList(4, 3, 9, 7, 8, 5, 6);
        int sum = arrList.stream().filter(i -> i % 2 != 0).mapToInt(n -> n * n).sum();
        System.out.println("Sum  of square of odd num : " + sum);
    }
}
