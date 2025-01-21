package StringsCode;
//Write a program to return the length of the longest word
// from a string whose length is even?
public class LongestWordEvenLength {
    public static int longestWord(String str){
        int maxLength=0;
        String[] words=str.split("\\s+");
        for(String word:words){
            if(word.length()>maxLength && word.length()%2==0){
                maxLength=word.length();
            }
        }
        return maxLength;

    }

    public static void main(String[] args) {
        String str ="my name is kanhaiy kumar";
        System.out.println(longestWord(str));
    }
}
