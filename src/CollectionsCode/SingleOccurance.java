package CollectionsCode;

import java.util.HashMap;
import java.util.Map;

//Write a program to find the element which is not occurring twice in the below sorted
// array where all the elements are occurring twice except one element. Solution should
// be in log n
//[3,3,4,4,5,6,6,7,7]
public class SingleOccurance {
    public static int singleOccur(int[] arr){
        Map<Integer,Integer> map=new HashMap<>();
        for (int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key:arr){
            if (map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={3,3,4,4,5,6,6,5,7};
        System.out.println(singleOccur(arr));
    }
}
