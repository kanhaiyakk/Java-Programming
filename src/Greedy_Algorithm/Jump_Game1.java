package Greedy_Algorithm;

public class Jump_Game1 {
    public static int minJum(int[] arr){
        int jumps=1;
        int maxIdx=arr[0];
        int end=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i> maxIdx) return -1;
            if (i==arr.length-1) return jumps;
            maxIdx=Math.max(maxIdx, i+arr[i]);
            if (i==end){
                jumps++;
                end=maxIdx;
            }
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] arr= {2, 3, 1, 1, 4};
        System.out.println(minJum(arr));

        int[] arr2 = {1, 1, 1, 1, 1};
        System.out.println(minJum(arr2));

        int[] arr3 = {3, 2, 1, 0, 4};
        System.out.println(minJum(arr3));
    }
}
