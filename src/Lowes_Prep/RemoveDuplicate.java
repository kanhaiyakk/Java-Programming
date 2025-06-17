package Lowes_Prep;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Q.Find the duplicate value int the array and remove them
public class RemoveDuplicate {
    public static int[] findDup(int[] arr){
        int n= arr.length;
        // Use LinkedHashSet to preserve insertion order
        Set<Integer> set=new LinkedHashSet<>();
        for (int num:arr) {
            set.add(num);    // duplicates automatically removed
        }
        // Convert set back to array
        int[] res=new int[set.size()];
        int i=0;
        for (int num:set) {
            res[i++]=num;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,2,5,8,7,5,9};
        int[] ans=findDup(arr);
        System.out.println(Arrays.toString(ans));
    }
}
