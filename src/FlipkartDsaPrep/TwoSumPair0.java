package FlipkartDsaPrep;

import java.util.ArrayList;
import java.util.Arrays;
//Given an integer array arr, return all the unique pairs
// [arr[i], arr[j]] such that i != j and arr[i] + arr[j] == 0.
//Note: The pairs must be returned in sorted order, the solution
// array should also be sorted, and the answer must not contain any duplicate pairs.
public class TwoSumPair0 {
    public static ArrayList<ArrayList<Integer>> twoSum(int[] arr){
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        int left=0;
        int right=arr.length-1;
        Arrays.sort(arr);
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==0){
                result.add(new ArrayList<>(Arrays.asList(arr[left], arr[right])));

                while(left<right && arr[left]==arr[left+1] ) left++;
                while(left<right && arr[right]==arr[right-1]) right--;

                left++;
                right--;
            }
            else if(sum<0){
                left++;
            }
            else{
                right--;
            }

        }
        return result;
    }
public static void main(String[] args) {
    int[] arr={6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
    System.out.println(twoSum(arr));
}
}
