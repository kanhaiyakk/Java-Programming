package StringsCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstRepeatingChar {
    public static char firstRep(String S) {
        Map<Character,Integer> freqMap=new HashMap<>();
        for (char ch : S.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0)+1);

        }
        for (char c : S.toCharArray()){
            if (freqMap.get(c)>1){
                return c;
            }
        }
        return '#'; // Return '#' if no repeating character is found
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(firstRep("geeksforgeeks")); // Expected Output: g
        System.out.println(firstRep("abcdef"));        // Expected Output: #
        System.out.println(firstRep("aabcc"));         // Expected Output: a
        System.out.println(firstRep(""));             // Expected Output: #
    }
}
