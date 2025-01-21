package StringsCode;

public class SequenceRemove {
    public static String removeConsecutiveCharacter(String s) {

        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="aabaa";
        System.out.println(removeConsecutiveCharacter(s));
    }
}
