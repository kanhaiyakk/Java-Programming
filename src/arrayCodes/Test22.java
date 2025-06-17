package arrayCodes;

import java.util.HashSet;
import java.util.Set;

public class Test22 {
    public static boolean findTraget(int[] arr, int target){
        Set<Integer> seen=new HashSet<>();
        for (int num: arr){
            int curr=target-num;
            if (seen.contains(curr)){
                return true;
            }
            else {
                seen.add(num);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={5,8,7,9,6,10};
        int target=15;
        System.out.println(findTraget(arr,target));
    }
}
