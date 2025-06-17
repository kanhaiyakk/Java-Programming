package Wissen_prep;

import java.util.HashMap;
import java.util.Map;

public class CanRearrangeToPalindrome {
    public static boolean canBePalindrome(String str){
        Map<Character,Integer> map=new HashMap<>();
        for(char ch: str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        int oddCount=0;
        for (int num: map.values()){
            if (num%2!=0){
                oddCount++;
            }
        }
        if (oddCount>1){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="aabdcc";
        System.out.println(canBePalindrome(str));
    }
}
