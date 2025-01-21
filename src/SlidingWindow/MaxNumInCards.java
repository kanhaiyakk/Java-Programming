package SlidingWindow;
//Leetcode 1423
//There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.
//
//In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.
//
//Your score is the sum of the points of the cards you have taken.
//
//Given the integer array cardPoints and the integer k, return the maximum score you can obtain.
public class MaxNumInCards {
    public static int maxnumsincard(int[] arr,int k){
        int lSum=0;
        int rSum=0;
        int maxSum=0;
        int n= arr.length;
        for (int i = 0; i <= k-1; i++) {
            lSum=lSum+arr[i];
            maxSum=lSum;
        }

        int rIndex=n-1;
        for (int i = k-1; i >=0 ; i--) {
            lSum=lSum-arr[i];
            rSum=rSum+arr[rIndex];
            rIndex=rIndex-1;
            maxSum=Math.max(maxSum,lSum+rSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr={6,2,3,4,7,2,1,7,1};
        int k=4;
        System.out.println(maxnumsincard(arr,k));
    }
}
