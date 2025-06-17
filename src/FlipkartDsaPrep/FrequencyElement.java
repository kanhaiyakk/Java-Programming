package FlipkartDsaPrep;

import java.util.LinkedHashMap;
import java.util.Map;

//Print the first number that satisfies exactly the given frequency condition
//Input: 1 2 3 4 5 4 4 2 3 1 6 2
//Frequency: 2
//Expected Output: 3
public class FrequencyElement {
    public static int frequency(int[] arr, int targetFrequency){
        Map<Integer,Integer> map=new LinkedHashMap<>();
        for (int num: arr){
            map.put(num,map.getOrDefault(num,0)+1);
            
        }
        for (int num:arr){
            if (map.get(num)==targetFrequency){
                return num;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 4, 4, 2, 3, 1, 6, 2};
        int targetFrequency=2;
        System.out.println(frequency(arr,targetFrequency));
    }
}
