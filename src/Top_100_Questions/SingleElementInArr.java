package Top_100_Questions;

import java.util.HashSet;
import java.util.Set;

public class SingleElementInArr {
    public static int singleElement(int[] arr){
        //approach-2 (Xor operation
        int result=0;
        for (int num:arr) {
            result ^= num;
        }
        return result;
        //approach-1(using Set)
//        Set<Integer> seen=new HashSet<>();
//        for (int num:arr){
//            if (seen.contains(num)){
//                seen.remove(num);
//            }
//            else{
//                seen.add(num);
//            }
//        }
//        for (int res:seen){
//            return res;
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4,5};
        System.out.println(singleElement(arr));
    }
}
