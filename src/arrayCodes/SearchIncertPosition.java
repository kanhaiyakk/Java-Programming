package arrayCodes;

import java.util.Arrays;

public class SearchIncertPosition {
    public static int searchIndex(int[] nums, int target) {
        int left=0;
        int right= nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;

            if (nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums={1, 3, 5, 6,9,17,65,12};
        int target=65;
        int result = searchIndex(nums,target);
        System.out.println(result);
    }
}
