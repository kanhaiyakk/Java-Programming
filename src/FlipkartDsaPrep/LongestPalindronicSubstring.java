package FlipkartDsaPrep;

public class LongestPalindronicSubstring {
    public static String longestPalindromic(String str){
int n=str.length();
String longest="";
        for (int i = 0; i <n ; i++) {
            for (int j = i; j < n; j++) {
                if (isPalindrome(str,i,j) && (j-i+1)>longest.length()){
                    longest=str.substring(i,j+1);
                }
            }
        }
        return longest;
    }
    public static boolean isPalindrome(String str,int left,int right){
        while (left<=right){
            if (str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="babad";
        System.out.println(longestPalindromic(str)           );
    }
}
