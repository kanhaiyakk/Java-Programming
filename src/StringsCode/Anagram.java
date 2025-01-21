package StringsCode;

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1, String s2){
        if (s1.length()!= s2.length()) return false;

        char[] ch1=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);


    }

    public static void main(String[] args) {
        String s1="geeks";
        String s2="kseek";
        System.out.println(isAnagram(s1,s2));
    }
}
