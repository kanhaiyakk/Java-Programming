package FlipkartDsaPrep;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String str){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=0;
        for (int i = 0; i < str.length(); i++) {
            int currentVal=map.get(str.charAt(i));
            if (i+1 < str.length() && currentVal<map.get(str.charAt(i+1))){
                result -= currentVal;
            }else {
                result += currentVal;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str="MCMXCIV";
        System.out.println(romanToInt(str));
    }
}
