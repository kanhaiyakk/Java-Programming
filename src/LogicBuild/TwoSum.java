package LogicBuild;

import java.util.Arrays;

//3. Two Sum Problem
//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//Example Input:
//nums = [2, 7, 11, 15], target = 9
//Output: [0, 1]
public class TwoSum {
    public static int[] findTwoSum(int[] arr,int target){
        int left=0;
        int right= arr.length-1;
        while (left<right){
            int sum=arr[left]+arr[right];
            if (sum==target){
                return new int[]{arr[left],arr[right]};

            } else if (sum<target) {
                left++;
            }else {
                right--;
            }
        }
        return null;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j <arr.length ; j++) {
//                if (arr[i]+arr[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
//        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] arr={2, 7, 11, 15};
        int target=9;
        int[] result=findTwoSum(arr,target);
        if (result != null){
            System.out.println(arr[0]+" , "+arr[1]);
        }else {
            System.out.println("No such pair exists.");
        }
       // System.out.println(Arrays.toString(result));
    }
}
