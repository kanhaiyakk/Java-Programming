package Top_100_Questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums,int target){
        //optimal
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentElement=target-nums[i];
            if (map.containsKey(currentElement)){
                return new int[]{map.get(currentElement),i};
            }
            map.put(nums[i],i);
        }
//Brute force
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i+1; j < nums.length; j++) {
//                if (nums[i]+nums[j]==target){
//                    return new int[]{i,j};
//                }
//            }
//        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] nums={5,8,7,3,12,14};
        int target=17;
        int[] res=twoSum(nums,target);
        System.out.println(Arrays.toString(res));
    }
}
