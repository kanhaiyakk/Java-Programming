package StringsCode;

import java.util.HashMap;
import java.util.Map;

//Given a sentence, return count of words which is repeated.
public class CountSimilarWords {
    public static void main(String[] args) {
        String str="This is java language. java is very good language";
        String notmalize=str.replaceAll("[^a-zA-Z\\s]","").toLowerCase();
        String[] words=notmalize.split("\\s+");
        Map<String ,Integer> map=new HashMap<>();
        for (String word: words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}
