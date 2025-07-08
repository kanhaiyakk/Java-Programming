package java8Codes;

import java.util.Arrays;

//Given an array [1,2,4,5,8,12,9,40] using java 8 filter the array for the first value less than 40.
public class  FindFirstNum {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,8,12,9,40};
        int num= Arrays.stream(arr).filter(i-> i<40).findFirst().orElse(-1);
        System.out.println(num);
    }

}
