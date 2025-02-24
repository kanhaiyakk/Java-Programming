package FlipkartDsaPrep;

import java.util.LinkedHashMap;
import java.util.Map;

public class IndexOfSingleChar {
    public static int indexOfChar(String str){
       //Method-2
        int[] freq=new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[str.charAt(i)]==1){
                return i;
            }
        }
        return -1;


        //Method-1
//        Map<Character,Integer> map=new LinkedHashMap<>();
//        for (char ch: str.toCharArray()){
//            map.put(ch, map.getOrDefault(ch,0)+1);
//        }
//        for (int i = 0; i < str.length(); i++) {
//            if (map.get(str.charAt(i))==1){
//                return i;
//            }
//        }
//        return -1;

   }

    public static void main(String[] args) {
        String str="aabbccdee";    
        System.out.println(indexOfChar(str));
    }
}
