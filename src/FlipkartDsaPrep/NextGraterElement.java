package FlipkartDsaPrep;

import java.util.ArrayList;

public class NextGraterElement {
    public static ArrayList<Integer> nextGrater(int arr[]){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            boolean found=false;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]>arr[i]){
                    list.add(arr[j]);
                    found=true;
                    break;
                }
            }
            if (!found){
                list.add(-1);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 4};
        System.out.println(nextGrater(arr1)); // Output: [3, 4, 4, -1]

        int[] arr2 = {6, 8, 0, 1, 3};
        System.out.println(nextGrater(arr2)); // Output: [8, -1, 1, 3, -1]
    }
}
