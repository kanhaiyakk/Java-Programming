package arrayCodes;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,4,5,6};
       // method-1 brute force
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i]== arr[j]){
//                    System.out.println(arr[i]);
//                }
//            }
//        }


        //method-2 : using HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int value : arr){
            if (!set.add(value)){
                System.out.println(value);
            }
        }
    }
}
