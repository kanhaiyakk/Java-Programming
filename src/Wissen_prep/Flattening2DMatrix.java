package Wissen_prep;

import java.util.Arrays;

public class Flattening2DMatrix {
    public static int[] flatteningMatrix(int[][] matrix){
//        int row=matrix.length;
//        int column=matrix[0].length;
//        int[] nums=new int[row*column];
//        int i=0;
//        for (int[] arr:matrix) {
//            for (int num : arr) {
//                nums[i++] = num;
//            }
//        }
//        return nums;
        return Arrays.stream(matrix)
                .flatMapToInt(Arrays::stream)
                .toArray();
    }

    public static void main(String[] args) {
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[] res=flatteningMatrix(matrix);
        System.out.println(Arrays.toString(res));
    }
}
