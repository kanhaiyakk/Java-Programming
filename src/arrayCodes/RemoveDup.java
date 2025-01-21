package arrayCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDup {

    public static int removeDuplicate(int[] arr){

        int slow=0;
        for (int fast = 0; fast < arr.length; fast++) {
            if (arr[fast] != arr[slow]){
                slow++;
                arr[slow] = arr[fast];
            }
        }
        return slow+1;

    }

    public static void main(String[] args) {
        int[] arr={1,1,2,2,4,4,4};
        int k= removeDuplicate(arr);

        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
    }
}
