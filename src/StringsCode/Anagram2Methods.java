package StringsCode;



public class Anagram2Methods {
    public static void anagram(String s1,String s2){
        if (s1.length()!= s2.length()) {
            System.out.println("s1 and s2 are not anagram");
            return;
        }

        int[] freq=new int[26];
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for (int i: freq){
            if (i!=0){
                System.out.println("s1 and s2 are not Anagram");
                return;
            }
        }
        System.out.println("s1 and s2 are Anagram");

//        for (char ch:s1.toCharArray()){
//            freq[ch-'a']++;
//        }
//        for (char ch:s2.toCharArray()){
//            freq[ch-'a']--;
//        }
//        for (int i = 0; i < 26; i++) {
//            if (freq[i]!=0){
//                System.out.println("s1 and s2 are not Anagram");
//                return;
//            }
//        }
//        System.out.println("s1 and s2 are anagram");
    }

    public static void main(String[] args) {
        String s1="earth";
        String s2="heart";
        anagram(s1,s2);
    }
}
