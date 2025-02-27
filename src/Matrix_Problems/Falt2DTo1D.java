package Matrix_Problems;

import java.util.Arrays;

public class Falt2DTo1D {
    public static int[] flatArray(int[][] arr){
        int row= arr.length;
        int column=arr[0].length;

        int[] result=new int[row*column];
        int index=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[index++]=arr[i][j];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(flatArray(arr)));
    }
}
