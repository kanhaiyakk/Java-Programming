package StringsCode;

import java.util.LinkedHashMap;
import java.util.Map;
//To return the index of the first non-repeating character
// in a string, you can use the following
public class IndexOfDistinctChar {
    public static int indexOfDistinctCharacter(String str){
        int[] freq=new int[256];
        for (char ch:str.toCharArray()){
            freq[ch]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[str.charAt(i)]==1){
                return i;
            }

        }
return -1;
//        Map<Character,Integer> map=new LinkedHashMap<>();
//        for (char ch:str.toCharArray()){
//            map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if(map.get(str.charAt(i))==1){
//                return i;
//            }
//        }
//        return -1;
    }
    public static void main(String[] args) {
        String str="abMcdcakb";
        System.out.println(indexOfDistinctCharacter(str));

    }
}
