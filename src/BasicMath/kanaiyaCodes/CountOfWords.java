package BasicMath.kanaiyaCodes;

import java.util.HashMap;
import java.util.Map;

public class CountOfWords {
    public static int countOfRepeated(String sentence){
        if (sentence==null || sentence.isEmpty()){
            return 0;
        }
        String[] strArr=sentence.toLowerCase().split("\\s+");
        Map<String, Integer> countMap=new HashMap<>();

        for (String word: strArr){
            countMap.put(word,countMap.getOrDefault(word,0)+1);
        }
        int repeatWord=0;
        for (int count: countMap.values()){
            if (count>1){
                repeatWord++;
            }                             //Given a sentence, return count of words which is repeated.

        }
        return repeatWord;
    }

    public static void main(String[] args) {
        String sentence = "This is a test This test is simple simple";
        int repeatedWordCount = countOfRepeated(sentence);

        System.out.println("Number of repeated words: "+ repeatedWordCount);
    }

}
