package arrayCodes;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] mergeArray(int[] arr1,int[] arr2){
        int m= arr1.length;
        int n= arr2.length;
        int[] newArr=new int[m+n];
        for (int i = 0; i < m; i++) {
            newArr[i]=arr1[i];
        }
        for (int j = 0; j < n; j++) {
            newArr[m+j]=arr2[j];
        }
        Arrays.sort(newArr);
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,10,4,5};
        int[] arr2={6,7,2,9};
        int[] result=mergeArray(arr1,arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}
