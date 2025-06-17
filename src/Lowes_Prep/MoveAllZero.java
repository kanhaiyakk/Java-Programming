package Lowes_Prep;

import java.util.Arrays;
//Shift all the zeroes to the end of an array without using extra space.
public class MoveAllZero {
    public static int[] moveZeros(int nums[]){
        int left=0;
        for (int i=1;i< nums.length;i++){
            if(nums[i]!=0){
                nums[left]=nums[i];
                left++;
            }
        }
        while (left< nums.length){
            nums[left]=0;
            left++;
        }
        return nums;

//        int left=0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i]!=0){
//                int temp=nums[i];
//                nums[i]=nums[left];
//                nums[left]=temp;
//
//                left++;
//            }
//        }
//        return nums;
    }
    //Time Complexity: O(n), as we are traversing the array only twice.
    //Auxiliary Space: O(1)
    public static void main(String[] args) {
        int[] nums={1,2,0,7,0,3,0,9,0,8};
        int[] res=moveZeros(nums);
        System.out.println(Arrays.toString(res));
    }
}
