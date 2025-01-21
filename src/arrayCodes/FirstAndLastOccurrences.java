package arrayCodes;

import java.util.ArrayList;

public class FirstAndLastOccurrences {
    public static ArrayList<Integer> firstAndLast(int x, int arr[]) {
        int first=-1;
        int last=-1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        if(first==-1){
            list.add(-1);
        }else{
            list.add(first);
            list.add(last);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr={1, 3, 3, 4};
        int x=3;
        System.out.println(firstAndLast(x,arr));

    }
}
