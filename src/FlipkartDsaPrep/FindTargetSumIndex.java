package FlipkartDsaPrep;

import java.util.ArrayList;
import java.util.List;

public class FindTargetSumIndex {
    public static int findIndex(int[] nums, int target){
        List<Integer> list=new ArrayList<>();
        for (int i=0;i< nums.length;i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    list.add(i);
                    list.add(j);
                   // return list;
                }
            }
        }
        return list.size()/2;
    }

    public static void main(String[] args) {
        int[] nums={1,2,-1,11,5,8};
        int target=10;
        System.out.println(findIndex(nums,target));
    }
}
