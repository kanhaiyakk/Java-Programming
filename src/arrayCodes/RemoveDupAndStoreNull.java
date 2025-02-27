package arrayCodes;

import java.util.Arrays;

public class RemoveDupAndStoreNull {
    //given array is sorted
    public static Integer[] removeDup(Integer[] arr){
        int n= arr.length;
        int j=1;
        for (int i = 1; i < n; i++) {
            if (!arr[i].equals(arr[i-1])){
                arr[j]=arr[i];
                j++;
            }
        }
        while (j<n){
            arr[j]=null;
            j++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr={1,1,2,2,2,3,3,4,4};
        System.out.println(Arrays.toString(removeDup(arr)));
    }
}
