package arrayCodes;

import java.util.HashSet;
import java.util.Set;

//Missing number in shuffled array
public class MissingNum {
    public static int missingNum(int[] arr1,int[] arr2){
        int result=0;
        for (int num:arr1){
            result^=num;
        }
        for (int num:arr2){
            result^=num;
        }
        return result;
        //method 2
//        int sum1=0;
//        int sum2=0;
//        for (int num:arr1){
//            sum1+=num;
//        }
//        for (int num:arr2){
//            sum2+=num;
//        }
//        int res=Math.abs(sum1-sum2);
//        return res;


        //method 1
//        Set<Integer> set=new HashSet<>();
//        for (int num:arr1){
//            set.add(num);
//        }
//        for (int num:arr2){
//            set.remove(num);
//        }
//        if (!set.isEmpty()){
//            return set.iterator().next();
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 8, 1, 3, 7};
        int[] arr2 = {7, 4, 3, 1};
        System.out.println(missingNum(arr1,arr2));
    }
}
