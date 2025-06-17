package StringsCode;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static char mostChar(String s){
        Map<Character,Integer> freqMap=new HashMap<>();
        int maxCount=0;
        char maxChar='a';
        for (char ch:s.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
            if (freqMap.get(ch)>maxCount || (freqMap.get(ch)==maxCount && ch<maxChar)){
                maxCount=freqMap.get(ch);
                maxChar=ch;
            }
        }
        return maxChar;
    }
    // public static char getMaxOccuringChar(String s) {
    //        int[] freq=new int[26];
    //        int maxCount=0;
    //        char maxChar='a';
    //        for(int i=0;i<s.length();i++){
    //            char ch=s.charAt(i);
    //            freq[ch - 'a']++;
    //        }
    //        for(int i=0;i<26;i++){
    //            if(freq[i]>maxCount){
    //                maxCount=freq[i];
    //                maxChar=(char)(i + 'a');
    //            }else if(freq[i]==maxCount){
    //                maxChar=(char) Math.min(maxChar, i+'a');
    //            }
    //        }
    //        return maxChar;
    //    }

    public static void main(String[] args) {
        String s = "  bccccddddaaaa";
        char result = mostChar(s);
        System.out.println("Max occurring character: " + result);
    }
}
