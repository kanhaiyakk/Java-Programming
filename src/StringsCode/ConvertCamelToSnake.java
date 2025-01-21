package StringsCode;
//Convert String camel case to snake case.
public class ConvertCamelToSnake {
    public static String convertCamelToSnake(String str){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                sb.append('_');
                sb.append(Character.toLowerCase(ch));
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="myJavaCodingIsGood";
        System.out.println(convertCamelToSnake(str));
    }
}
