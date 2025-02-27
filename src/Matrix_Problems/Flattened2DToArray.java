package Matrix_Problems;

import java.util.Arrays;

public class Flattened2DToArray {
    public static int[] flattened(int[][] arr){
        return Arrays.stream(arr).flatMapToInt(Arrays::stream).toArray();
    }

    public static void main(String[] args) {
        int[][] arr= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(flattened(arr)));
    }
}
