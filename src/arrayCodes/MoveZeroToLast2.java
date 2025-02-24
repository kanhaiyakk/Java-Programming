package arrayCodes;

import java.util.Arrays;

public class MoveZeroToLast2 {
    public static void moveZeroToLast(int[] arr){
        int i=0;

        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={2,0,5,0,0,7,0,9,7,8};
        moveZeroToLast(arr);
    }
}
