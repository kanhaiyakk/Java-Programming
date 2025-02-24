package Greedy_Algorithm;

import java.util.Arrays;

public class ShortestJobFirst {
    public static int sortestJobFirst(int arr[]){
        int n=arr.length;
        int waitTime=0,time=0;
        Arrays.sort(arr);
        for (int num:arr){
            waitTime +=time;
            time +=num;
        }
        return waitTime/n;
    }

    public static void main(String[] args) {
        int[] arr={4,3,7,1,2};
        System.out.println(sortestJobFirst(arr));
    }
}
