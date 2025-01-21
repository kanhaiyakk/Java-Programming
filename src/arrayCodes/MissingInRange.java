package arrayCodes;

import java.util.Arrays;

public class MissingInRange {
    public static int findMissing(int[] nums) {
        int n = nums.length;
        int maxSum = n * (n + 1) / 2;
        int currSum = 0;

        for (int i = 1; i < nums.length; i++) {
            currSum += nums[i];
        }
        return maxSum - currSum;
    }
    public static void main(String[] args) {
        int[] nums={0,1};
        int result=findMissing(nums);
        System.out.println(result);
    }
}
