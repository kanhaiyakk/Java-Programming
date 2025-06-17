package FlipkartDsaPrep.New;

import java.util.Comparator;

//write a method that compares two words
// and return the one that has more number of vowels in it(use comparator/comparable interface).
public class CompareVowels {
    // Method to count vowels in a word
    public static int  countVowel(String s){
        int count=0;
        for (char ch: s.toCharArray()){
            if ("aeiou".indexOf(ch)!=-1){
                count++;
            }
        }
        return count;
    }
    // Comparator implementation to compare two words based on number of vowels
    static class VowelComparator implements Comparator<String >{
        @Override
        public int compare(String word1, String word2){
            return Integer.compare(countVowel(word1),countVowel(word2));
        }
    }
    // Method to return the word with more vowels
    public static String getWordWithMoreVowels(String word1,String word2){
        VowelComparator comparator=new VowelComparator();
        return comparator.compare(word1,word2) >=0 ? word1:word2;
    }
    public static void main(String[] args) {
        String word1 = "education";
        String word2 = "technology";

        String result = getWordWithMoreVowels(word1, word2);
        System.out.println("Word with more vowels: " + result);
    }
}
