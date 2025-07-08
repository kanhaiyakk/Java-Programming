package Amazon_prepration;
//Q. Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
// Note that after backspacing an empty text, the text will continue empty.
//Example: s = 'ab#c', t = 'ad#c' -> both result in 'ac', so return true.
//Example: s = 'a##c', t = '#a#c' -> both result in 'c', so return true.
public class StringBackPress {
    public static boolean backspaceCompare(String s, String t){
        return build(s).equals(build(t));
    }
    public static String build(String str){
        StringBuilder sb=new StringBuilder();
        for (char ch: str.toCharArray()){
            if (ch !='#'){
                sb.append(ch);
            } else if (sb.length()>0) {
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="a##c";
        String t="#a#c";
        System.out.println(backspaceCompare(s,t));
    }
}
