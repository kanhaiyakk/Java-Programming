package Amazon_prepration;

public class MaxAvg {
    public static double findMaxAvg(int[] arr,int k){
        double maxSum=0,windowSum=0;
        for (int i = 0; i < k; i++) {
            windowSum+=arr[i];
        }
        maxSum=windowSum;
        for (int i = k; i < arr.length ; i++) {
            windowSum+= arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum/k;

        //brute force
//        int n= arr.length;
//        double maxSum=0;   // maxSum=Double.NEGATIVE_INFINITY;
//        for (int i = 0; i <=n-k; i++) {
//            double sum=0;
//            for (int j = i; j <i+k ; j++) {
//                sum+=arr[j];
//            }
//            maxSum=Math.max(maxSum,sum);
//        }
//        return maxSum/k;
    }

    public static void main(String[] args) {
        int[] arr={1,12,-5,-6,50,3};
        int k=4;
        System.out.println(findMaxAvg(arr,k));
    }
}
