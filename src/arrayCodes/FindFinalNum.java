package arrayCodes;

import java.util.HashSet;
import java.util.Set;

public class FindFinalNum {
    public static int findDoubleFinal(int[] nums, int original){
        Set<Integer> numSet= new HashSet<>();
        for (int val:nums){
            numSet.add(val);
        }
        while (numSet.contains(original)){
            original=original*2;
        }
        return original;
    }

    public static void main(String[] args) {
       // int[] nums={5,3,6,1,12};
        int[] nums1={1,3,5,7,9};
        int original=7;
        int result=findDoubleFinal(nums1,original);
        System.out.println(result);
    }
}
