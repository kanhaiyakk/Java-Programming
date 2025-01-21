package LogicBuild;
//2. Largest Sum of Subarray (Kadane’s Algorithm)
//Find the maximum sum of a contiguous subarray in a given array.
//
//Example Input:
//nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6 (from subarray [4, -1, 2, 1])
public class KadanesAlgorithm {
    public static int kadans(int[] arr){
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        for (int num : arr) {
            currSum += num;
            maxSum = Math.max(maxSum, currSum);

            if (currSum < 0) {
                currSum = 0;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(kadans(arr));
    }
}
