package Amazon_prepration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IndexOfTargetSum {
    public static List<Integer> indexOfTargetSum(int[] nums, int target){
        List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int curr=target-nums[i];
            if (map.containsKey(curr)){
                list.add(map.get(curr));
                list.add(i);
                return list;

            }else{
                map.put(nums[i], i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums={2, 4, 11, 7, 5, 9};
        int target=16;
        System.out.println(indexOfTargetSum(nums,target));
    }
}
