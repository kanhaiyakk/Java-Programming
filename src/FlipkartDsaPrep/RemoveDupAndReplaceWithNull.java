package FlipkartDsaPrep;

import java.util.Arrays;

public class RemoveDupAndReplaceWithNull {
    public static void removeDup(Integer[] arr){
        int n= arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i].equals(arr[i-1])){
                arr[i-1]=null;
            }
        }
        int left=0;
        for (int i = 0; i < n; i++) {
            if (arr[i]!=null){
                Integer temp=arr[left];
                arr[left]=arr[i];
                arr[i]=temp;
                left++;
            }


        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] arr={1,2,2,3,3,4,4,4,5,5};
        removeDup(arr);
    }
}
