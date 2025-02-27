package IBM_Coding_Prep;

import java.util.HashSet;
import java.util.Set;

public class PangramCheck {
    public static boolean isPangram(String[] words){
        String str=String.join("",words);
        Set<Character> set=new HashSet<>();
        for (char ch: str.toCharArray()){
            if (ch>='a' && ch<='z'){
                set.add(ch);
            }
        }
        if (set.size()==26){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String[] words={"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        System.out.println(isPangram(words));//true

        String[] words1={"bit", "scale"};
        System.out.println(isPangram(words1));//false
    }
}
