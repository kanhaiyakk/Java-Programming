package FlipkartDsaPrep;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static double median(int[] arr1, int[] arr2){
        int n= arr1.length;
        int m= arr2.length;
        int[] margeArr=new int[n+m];
        int k=0;
        for (int i = 0; i < n; i++) {
            margeArr[k++]=arr1[i];
        }
        for (int i = 0; i < m; i++) {
            margeArr[k++]=arr2[i];
        }
        Arrays.sort(margeArr);
        int size=margeArr.length;
        if (size%2==1){
            return margeArr[size/2];
        }else {
            int mid1=margeArr[(size/2)-1];
            int mid2=margeArr[size/2];
            return ((double)(mid1 + mid2)) / 2.0;
        }
    }

    public static void main(String[] args) {
        int[] arr1={1,2};
        int[] arr2={3,4};
        System.out.println(median(arr1,arr2));
    }
}
