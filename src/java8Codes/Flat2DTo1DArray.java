package java8Codes;

import java.util.Arrays;

public class Flat2DTo1DArray {
    public static int[] falttArray(int[][] arr){
        return Arrays.stream(arr)
                .flatMapToInt(Arrays::stream).toArray();
    }

    public static void main(String[] args) {
        int[][] arr= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(falttArray(arr)));
    }
}
