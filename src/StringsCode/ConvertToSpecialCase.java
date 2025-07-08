package StringsCode;
//Write a Java program for the given string transformation:
//Input: tomorrow
//Output: t3m3223w
public class ConvertToSpecialCase {
    public static String convertString(String str){
        StringBuilder sb=new StringBuilder();
        for (char ch:str.toCharArray()){
            if(ch=='o'){
                sb.append('3');
            }else if(ch=='r'){
                sb.append('2');
            }else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str="tomorrow";
        System.out.println(convertString(str));
    }
}
