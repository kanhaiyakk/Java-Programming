package arrayCodes;

import static java.lang.Math.abs;

public class ContainsNum2 {
    public static boolean contains(int[] nums,int k){
        int n= nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (nums[i]==nums[j] && abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int k=2;
        int[] nums={1,2,1,3,2,3};
        boolean result=contains(nums,k);
        System.out.println(result);
    }
}
