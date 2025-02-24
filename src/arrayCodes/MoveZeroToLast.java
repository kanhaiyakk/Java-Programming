package arrayCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MoveZeroToLast {
    public static List<Integer> moveZero(int[] arr){
        List<Integer> list=new ArrayList<>();
        int i=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]!=0){
                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
               // list.add(arr[i]);
                i++;
            }
        }
        for (int num: arr){
            list.add(num);
        }
        return list;

//        List<Integer> integerList=new ArrayList<>();
//        List<Integer> list=new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]==0){
//                integerList.add(arr[i] );
//            }else {
//                list.add(arr[i] );
//            }
//        }
//        list.addAll(integerList);
//        return list;


        //Approach 1
//        List<Integer> list=new ArrayList<>();
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            list.add(arr[i] );
//        }
//        Collections.reverse(list);
//        return list;
    }

    public static void main(String[] args) {
        int[] arr={1,0,2,0,0,8,5,0,4};
       System.out.println(moveZero(arr));

    }
}
