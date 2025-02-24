package arrayCodes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReturnRepeatingAndMissingNum {
    public static ArrayList<Integer> findTwoElement(int arr[]){
        //method-2
        int n = arr.length;  //  Corrected n value
        ArrayList<Integer> list = new ArrayList<>();

        int[] freq = new int[n + 1];  // Frequency array of size (N+1)

        // Count occurrences of each number
        for (int num : arr) {
            freq[num]++;
        }

        int repeating = -1, missing = -1;

        // Identify repeating and missing numbers
        for (int i = 1; i <= n; i++) {
            if (freq[i] == 2) repeating = i;  // Found repeating number
            if (freq[i] == 0) missing = i;    // Found missing number
        }

        list.add(repeating);
        list.add(missing);
        return list;





//        int n = arr.length;
//        ArrayList<Integer> list = new ArrayList<>();
//
//        int totalSum = (n * (n + 1)) / 2;  //  Correct sum formula
//        int currSum = 0;
//        int repeating = -1;
//        Set<Integer> seen = new HashSet<>();
//
//        // Calculate sum and find the duplicate
//        for (int num : arr) {
//            currSum += num;
//            if (seen.contains(num)) {  //  Correct way to find duplicate
//                repeating = num;
//            }
//            seen.add(num);
//        }
//
//        int missing = totalSum - (currSum - repeating);  //  Compute missing number
//
//        list.add(repeating);
//        list.add(missing);
//        return list;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 3, 4, 5};  // Missing = 2, Repeating = 3
        System.out.println(findTwoElement(arr)); // Output: [3, 2]
    }
}
