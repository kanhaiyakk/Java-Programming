package Wissen_prep;

import java.util.HashMap;
import java.util.Map;

public class UniqueElementInSortedArr {
    public static int printUnique(int[] arr){
        //Binary search O(logn) time
        int low=0;
        int high= arr.length-1;
        while (low<high){
            int mid=low+(high-low)/2;
            if (mid%2==1){
                mid--;
            }
            if (arr[mid]==arr[mid+1]){
                low=mid+2;
            }else {
                high=mid;
            }

        }
        return arr[low];

        //O(n) time
//        Map<Integer,Integer> map=new HashMap<>();
//        for (int num:arr){
//            map.put(num,map.getOrDefault(num,0)+1);
//        }
//        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
//            if (entry.getValue()==1){
//                return entry.getKey();
//            }
//        }
//        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4,5,5};
        System.out.println(printUnique(arr));
    }
}
