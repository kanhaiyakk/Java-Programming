package LeetCode_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Union_of_Two_Sorted_Array {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n+m];
        for(int i=0;i<n;i++){
            arr[i]=nums1[i];
        }

        for(int i=0;i<m;i++){
            arr[n+i]=nums2[i];
        }
        Arrays.sort(arr);

        List<Integer> resList=new ArrayList<>();
        resList.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                resList.add(arr[i]);
            }
        }
        int[] result = new int[resList.size()];
        for(int i=0;i<resList.size();i++){
            result[i]=resList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums1={3, 4, 6, 7, 9, 9};
        int[] nums2={1, 5, 7, 8, 8};
        int[] res=unionArray(nums1,nums2);
        System.out.println(Arrays.toString(res));
    }
}
