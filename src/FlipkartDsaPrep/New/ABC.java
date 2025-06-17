package FlipkartDsaPrep.New;

import java.util.Comparator;

public class ABC {
    public static int countVowels(String s){
        int count=0;
        for (char ch: s.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
    static class CompareVowels implements Comparator<String>{
        @Override
        public int compare(String word1,String word2){
            return Integer.compare(countVowels(word1),countVowels(word2));
        }
    }
    public static String getWordWithMoreVowels(String word1,String word2){
        CompareVowels comparator=new CompareVowels();
        return comparator.compare(word1,word2) >=0 ? word1:word2;
    }
    public static void main(String[] args) {
        String word1 = "education";
        String word2 = "technology";

        String result = getWordWithMoreVowels(word1, word2);
        System.out.println("Word with more vowels: " + result);
    }
}
