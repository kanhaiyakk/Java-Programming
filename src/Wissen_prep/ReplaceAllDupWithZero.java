package Wissen_prep;

import java.util.*;

public class ReplaceAllDupWithZero {
    public static int[] replaceDup(int[] arr){
       Set<Integer> set=new HashSet<>();
        List<Integer> result=new ArrayList<>();
       int countZero=0;
       for (int num:arr){
           if (!set.contains(num)){
               set.add(num);
               result.add(num);
           }else {
               countZero++;
           }
       }
       while (countZero > 0){
           result.add(0);
           countZero--;
       }
       int[] res=new int[result.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=result.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4};
        int[] res=replaceDup(arr);
        System.out.println(Arrays.toString(res));
    }
}
