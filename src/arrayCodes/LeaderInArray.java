package arrayCodes;

import java.util.ArrayList;
import java.util.Collections;

public class LeaderInArray {
    public static ArrayList<Integer> leaderNum(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        int leader=arr[n-1];
        list.add(leader);
        for (int i = n-2; i>=0 ; i--) {
            if (arr[i]>=leader){
                leader=arr[i];
                list.add(leader);
            }
        }
        Collections.reverse(list);
        return list;
    }
    public static void main(String[] args) {
        int[] arr={20,15,5,3,1};
        System.out.println(leaderNum(arr));
    }
}
