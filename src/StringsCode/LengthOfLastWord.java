package StringsCode;
//
public class LengthOfLastWord {
    public static int lengthOfStr(String str){
        str.trim();
        String[] words=str.split("\\s+");
        return words[words.length-1].length();
    }

    public static void main(String[] args) {
        String str="all is wellkk           ";
        System.out.println(lengthOfStr(str));
    }
}
