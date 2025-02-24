package FlipkartDsaPrep;

public class MaxSubArraySum {
    public static int maxSubArrSum(int[] arr){
        //Optimal Approach: Kadane’s Algorithm (O(n))
        int maxSum=Integer.MIN_VALUE;
        int sum=0;
        for (int num:arr){
            sum=sum+num;
            if (sum>maxSum){
                maxSum=sum;
            }
            if (sum<0){
                sum=0;
            }
        }
        return maxSum;


        ////Brute Force Approach (O(n²))

 //      int maxSum=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            int sum=0;
//            for (int j = i; j < arr.length; j++) {
//                sum+=arr[j];//// Sum of subarray from i to j
//                maxSum=Math.max(maxSum,sum);
//            }
//            if (sum<0){
//                sum=0;
//            }
//        }
//        return maxSum;

    }

    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};
        System.out.println(maxSubArrSum(arr));
    }
}
