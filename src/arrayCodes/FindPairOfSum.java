package arrayCodes;

import java.util.Arrays;

public class FindPairOfSum {
    public static void findSum(int[] arr,int targetSum){
        Arrays.sort(arr);
        int low=0;
        int high=arr.length-1;
        while (low<high){
            int current_Sum=  arr[low]+arr[high];
            if (current_Sum==targetSum){
                System.out.println("(" +arr[low] + "," + arr[high]+")");
                return;
            }
            else if (current_Sum<targetSum){
                low++;
            }
            else {
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={2,5,9,7,6,11,12,14};

        int targetSum=26;
        findSum(arr,targetSum);
    }
}
