package PuzzleQuestions;

public class LongestCommonPrefix {
    public static String longestPrefix(String[] str){
        if (str.length==0 || str==null){
            return "";
        }
        for (int i=0 ; i<str[0].length();i++){
            char current_char= str[0].charAt(i);

            for (int j=1;j<str.length;j++){
                if (i>=str[j].length() || str[j].charAt(i) != current_char){
                    return str[0].substring(0,i);
                }
            }
        }
return str[0];
}

    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestPrefix(str)); }
}

