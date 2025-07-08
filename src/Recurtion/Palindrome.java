package Recurtion;

public class Palindrome {
    public static boolean isPalindrome(String str){
        String reversed=reverseString(str);
        if (str.equals(reversed)){
            return true;
        }
        return false;
    }
    public static String reverseString(String word){
        if (word.isEmpty() ) return word;
        return reverseString(word.substring(1))+word.charAt(0);
    }

    public static void main(String[] args) {
        String str="madam";
        System.out.println(isPalindrome(str));
    }
}
