package arrayCodes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonElementInTwoArray {
    public static List<Integer> common(int[] arr1, int[] arr2){
       List<Integer> list=new ArrayList<>();
        Map<Integer,Integer> map=new HashMap<>();
        for (int num: arr1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int num1:arr2){
            if (map.containsKey(num1)){
                 list.add(num1);
            }
        }
        return list;
    }
    public static List<Integer> union(int[] arr1, int[] arr2){
        List<Integer> integerList=new ArrayList<>();
        for (int num: arr1){
            integerList.add(num);
        }
        for (int num: arr2){
            integerList.add(num);
        }
       integerList.removeAll(common(arr1,arr2));
        return integerList;
    }

    public static void main(String[] args) {
        int[] arr1={80,10,15,2,35,60};
        int[] arr2={35,80,60,20,75};
        System.out.println(common(arr1,arr2));
        System.out.println(union(arr1,arr2));
    }
}
