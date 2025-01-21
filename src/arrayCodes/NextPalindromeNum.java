package arrayCodes;

public class NextPalindromeNum {
    public static boolean isPalindrome(int num){
        String str=Integer.toString(num);
        int left=0;
        int right=str.length()-1;
        while (left<right){
            if (str.charAt(left)!=str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static int  nextPalindrome(int num){
        num++;
        while (true){
            if (isPalindrome(num)){
                return num;
            }
            num++;
        }
    }

    public static void main(String[] args) {
        int num=999;
        System.out.println(nextPalindrome(num));
    }
}
