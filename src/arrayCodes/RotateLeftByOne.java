package arrayCodes;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateLeftByOne {
    public static void rorateByOnePlace(int[] arr){
        int temp=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={1,5,9,7,6,4};
        rorateByOnePlace(arr);
    }
}
