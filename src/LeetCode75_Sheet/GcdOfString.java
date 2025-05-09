package LeetCode75_Sheet;

public class GcdOfString {
    public static String gcdOfStrings(String str1, String str2){
        if (! (str1+str2).equals(str2+str1)) return "";
        int maxLength=gcd(str1.length(),str2.length());
        return str1.substring(0,maxLength);
    }
    public static int gcd(int a,int b){
        if (b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC")); // Output: "ABC"
        System.out.println(gcdOfStrings("ABABAB", "ABAB")); // Output: "AB"
        System.out.println(gcdOfStrings("LEET", "CODE")); // Output: ""
    }
}
