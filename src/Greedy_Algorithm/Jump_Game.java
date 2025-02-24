package Greedy_Algorithm;

public class Jump_Game {
    public static boolean jumplast(int[] arr){
        int maxIdx=0;
        for (int i = 0; i < arr.length; i++) {
            if (i> maxIdx) return false;
            maxIdx=Math.max(maxIdx, i+arr[i]);
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,1,4};
        System.out.println(jumplast(arr));
    }
}
