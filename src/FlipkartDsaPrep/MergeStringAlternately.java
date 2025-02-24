package FlipkartDsaPrep;

public class MergeStringAlternately {
    public static String mergeStrings(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;

        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) sb.append(word1.charAt(i++));
            if (j < word2.length()) sb.append(word2.charAt(j++));
        }

        return sb.toString();

        //method 1
//        int len1 = word1.length();
//        int len2 = word2.length();
//        int i=0;
//        StringBuilder sb = new StringBuilder();
//        while (i<len1 && i<len2){
//            sb.append(word1.charAt(i));
//            sb.append(word2.charAt(i));
//            i++;
//        }
//        if (i<len1){
//            sb.append(word1.substring(i));
//        } else if (i<len2) {
//            sb.append(word2.substring(i));
//        }
//        return sb.toString();
    }

    public static void main(String[] args) {
        String  word1="abc";
        String word2="kdrdre";
        System.out.println(mergeStrings(word1,word2));
    }
}
