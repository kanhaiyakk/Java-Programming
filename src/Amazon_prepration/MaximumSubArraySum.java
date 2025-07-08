package Amazon_prepration;
//Maximum Subarray Sum Problem Statement
//Given an array of integers, determine the maximum possible
// sum of any contiguous subarray within the array.
public class MaximumSubArraySum {
    public static int maxSum(int[] arr){
        int currSum=arr[0];
        int maxSum=arr[0];
        for (int i = 1; i < arr.length; i++) {
            currSum=Math.max(arr[i], currSum+arr[i]);
            maxSum=Math.max(maxSum,currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
    int[] arr={-5, -1, -8, -9};
        System.out.println(maxSum(arr));
    }
}
