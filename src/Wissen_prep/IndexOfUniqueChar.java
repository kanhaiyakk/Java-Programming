package Wissen_prep;

import java.util.LinkedHashMap;
import java.util.Map;

public class IndexOfUniqueChar {
    public static int indexOfUniqueChar(String str){
        Map<Character,Integer> map=new LinkedHashMap<>();
        for (char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (map.get(ch)==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str="abcdabc";
        System.out.println(indexOfUniqueChar(str));
    }
}
