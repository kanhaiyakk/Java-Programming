package arrayCodes;

import java.util.Arrays;

public class KLargestInArray {
    public static int[] kLargest(int[] arr,int k){
        int newArr[]=new int[k];
        Arrays.sort(arr);
        for (int i = 0; i <k ; i++) {

                newArr[i]=arr[arr.length-1-i];

        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[]={1,5,6,11,18,15,9,7};
        int k=3;
        int[] result=kLargest(arr,k);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");

        }
    }
}
