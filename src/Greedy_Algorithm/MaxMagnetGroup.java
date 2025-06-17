package Greedy_Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxMagnetGroup {
    public static int maxMagnetGroup(int input1,int input2, int[] input3){
        Arrays.sort(input3);
        int count=1;
        int lastAdded=input3[0];
        for (int i = 1; i < input1; i++) {
            if(input3[i]-lastAdded>=input2){
                count++;
                lastAdded=input3[i];
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int input1=12;
        int input2=3;
        int[] input3={1,5,6,1,8,3,12,2,13,7,9,11};
        System.out.println(maxMagnetGroup(input1,input2,input3));
    }
}
