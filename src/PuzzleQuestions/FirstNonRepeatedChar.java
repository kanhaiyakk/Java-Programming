package PuzzleQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static int findFirstNonRepeatedChar(String str){
        Map<Character, Integer> charCountMap=new HashMap<>();
        for (char ch : str.toCharArray()){
            charCountMap.put(ch, charCountMap.getOrDefault(ch,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : charCountMap.entrySet()){
            if (entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String sentence="aabbcddeffg";
        char result= (char) findFirstNonRepeatedChar(sentence);
        System.out.println("First non repeted char is: "+result );
    }
}
