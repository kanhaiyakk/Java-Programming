package arrayCodes;

import java.util.Arrays;

public class LargestNumInArray {
    public static int findLargestNum(int[] arr){
        //if (arr.length==1) return arr[0];
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
//        //brute force
//        Arrays.sort(arr);
//        return arr[arr.length-1];
    }
    //brute force

    public static void main(String[] args) {
        int arr[]={10,5,84,74,66};
        System.out.println(findLargestNum(arr));
    }
}
