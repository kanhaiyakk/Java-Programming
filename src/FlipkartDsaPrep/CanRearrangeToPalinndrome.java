package FlipkartDsaPrep;

import java.util.HashSet;
import java.util.Set;

public class CanRearrangeToPalinndrome {

   public static boolean canRearrangeToPalindrome(String str){
       int[] freq=new int[26];
       for (char ch:str.toCharArray()){
           freq[ch-'a']++;
       }
       int oddCounnt=0;
       for (int i = 0; i < 26; i++) {
           if (freq[i]%2!=0){
               oddCounnt++;
           }
       }
       if (oddCounnt>1){
           return false;
       }
       return true;
//        Set<Character> set=new HashSet<>();
//        for (char ch: str.toCharArray()){
//            if (set.contains(ch)){
//                set.remove(ch);
//            }else {
//                set.add(ch);
//            }
//        }
//        return set.size()<=1;
    }

    public static void main(String[] args) {
        System.out.println(canRearrangeToPalindrome("civic"));    // true
        System.out.println(canRearrangeToPalindrome("ivicc"));    // true
        System.out.println(canRearrangeToPalindrome("hello"));    // false
        System.out.println(canRearrangeToPalindrome("aabbccdde")); // true
    }
}
