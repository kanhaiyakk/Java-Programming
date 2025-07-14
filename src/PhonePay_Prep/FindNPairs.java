package PhonePay_Prep;

import java.util.ArrayList;
import java.util.List;

public class FindNPairs {
    public static List<List<Integer>> findSumPairs(int[] nums, int target){
        List<List<Integer>> result=new ArrayList<>();
        int n= nums.length;
        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j <n ; j++) {
                sum+=nums[j];

                if (sum==target){
                    List<Integer> pair=new ArrayList<>();
                    pair.add(i);
                    pair.add(j);
                    result.add(pair);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={5,4,6,3,12,-3};
        int target=9;

        System.out.println(findSumPairs(nums,target));
    }
}
