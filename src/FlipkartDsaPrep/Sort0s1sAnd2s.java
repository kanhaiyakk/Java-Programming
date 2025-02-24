package FlipkartDsaPrep;

import java.util.Arrays;

public class Sort0s1sAnd2s {
    public static void sort012(int[] arr){
        int left=0,mid=0,high=arr.length-1;
        while (mid<=high){
            if (arr[mid]==0){
                int temp=arr[left];
                arr[left]=arr[mid];
                arr[mid]=temp;
                left++;
                mid++;
            } else if (arr[mid]==1) {
                mid++;
            } else if (arr[mid]==2) {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;

                high--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr={1,2,0,2,1,0,1,0,0,2,2,1};
        sort012(arr);
    }
}
