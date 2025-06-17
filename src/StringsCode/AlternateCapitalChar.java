package StringsCode;

public class AlternateCapitalChar {
    public static String formatString(String str){
        StringBuilder sb=new StringBuilder();
        int charCount=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if (ch!=' '){
                if (charCount==0){
                    sb.append(Character.toUpperCase(ch));

                } else if (charCount%2!=0) {
                    sb.append(Character.toLowerCase(ch));

                }else {
                    sb.append(Character.toUpperCase(ch));

                }
                charCount++;
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "artificial intelligenc is transforming the world";
        String res=formatString(input);
        System.out.println(res);
    }
}
