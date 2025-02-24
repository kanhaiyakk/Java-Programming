package FlipkartDsaPrep;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGraterElement2 {
    public static int[] nextGrater(int[] arr1,int[] arr2){
        Map<Integer,Integer> nextMap=new HashMap<>();
        Stack<Integer> stack=new Stack<>();
        for (int num: arr2 ){
            while (!stack.isEmpty() && stack.peek()<num){
                nextMap.put(stack.pop(),num);
            }
            stack.push(num);
        }
        int[] newArr=new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            newArr[i]=nextMap.getOrDefault(arr1[i],-1);

        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 1, 2};
        int[] arr2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGrater(arr1,arr2)));
    }
}
