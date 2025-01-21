package StringsCode;

import java.util.HashMap;
import java.util.Map;
//To check whether a given string can be rearranged to form a palindrome
public class IsRearrangeToPlaindrome {
    public static boolean isConvertedToPalindrome(String str){
        Map<Character,Integer> map=new HashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }
        int oddCount=0;
        for (int count: map.values() ){
            if (count%2!=0){
                oddCount++;
            }
        }
        if (oddCount>1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="racecar";
        System.out.println(isConvertedToPalindrome(str));
    }
}
