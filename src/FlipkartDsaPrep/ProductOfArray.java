package FlipkartDsaPrep;

import java.util.Arrays;

//Product of Array Except Self
public class ProductOfArray {
    public static int[] productArr(int[] arr){

        //Brute Force Code (O(n²) Time)
        int n= arr.length;
        int[] result=new int[n];
        for (int i = 0; i < n; i++) {
            int product=1;
            for (int j = 0; j < n; j++) {
                if (i!=j){
                    product*=arr[j];
                }
            }
            result[i]=product;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] res=productArr(arr);
        System.out.println(Arrays.toString(res));//[24, 12, 8, 6]

    }
}
