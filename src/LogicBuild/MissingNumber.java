package LogicBuild;
//1. Find Missing Number in Array
//Given an array of integers ranging from 1 to n, where one number is missing, find the missing number.
//
//Example Input:
//nums = [1, 2, 4, 6, 7]
//Output: 5
public class MissingNumber {
    public static int missNum(int[] arr){
        int n=arr.length+1;
        int totalSum=n*(n+1)/2;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
        }
        return totalSum-currSum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(missNum(arr));
    }
}
