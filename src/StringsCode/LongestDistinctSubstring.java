package StringsCode;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctSubstring {
    public static int longSubstring(String s){
        int n=s.length();
        int left=0;
        int maxLength=0;
        Set<Character> set=new HashSet<>();
        for (int right = 0; right < n; right++) {
            char ch=s.charAt(right);
            while (set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        System.out.println("Length of longest distinct substring: " + longSubstring(s));
    }
}
