package Lowes_Prep;

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static int[] merge(int[] arr1, int[] arr2){
        int i=0, j=0,k=0;
        int n= arr1.length;
        int m= arr2.length;
        int[] arr=new int[n+m];
        while (i<n && j<m){
            if (arr1[i]<arr2[j]){
                arr[k++]=arr1[i++];
            }else{
                arr[k++]=arr2[j++];
            }
        }
        while (i<n){
            arr[k++]=arr1[i++];
        }
        while (j<m){
            arr[k++]=arr2[j++];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9,10};
        int[] ans=merge(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
}
