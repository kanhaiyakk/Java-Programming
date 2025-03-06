package FlipkartDsaPrep;

public class LongestPalindronicSubstringOptimise {

    public static String longestSub(String str){
        String longest="";
        for (int i = 0; i < str.length(); i++) {
            String odd=middleIndexPalindrome(str,i,i);
            String even=middleIndexPalindrome(str,i,i+1);
            if (odd.length()>longest.length()){
                longest=odd;
            }
            if (even.length()>longest.length()){
                longest=even;
            }

        }
        return longest;
    }
    public static String middleIndexPalindrome(String str, int left,int right){
        while (left>=0 && right<str.length() && str.charAt(left)==str.charAt(right)){
            left--;
            right++;
        }
        return str.substring(left+1,right);
    }

    public static void main(String[] args) {
        String str="babad";
        System.out.println(longestSub(str));
    }
}
