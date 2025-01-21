package StringsCode;

public class ConvertMobNum {
    public static String mobNum( String input){
        String str=input.replace("(", "" ).replace(")" , "");
        String repNum= str.substring(0,3);
        String remaning=str.substring(3);
//        String str=input.replaceAll("[()]" , "");
//        String replaceNum=str.replaceFirst("(\\d{3})(\\d+)", "$1 $2");
//        return replaceNum;
        return repNum+" "+remaning;
    }

    public static void main(String[] args) {
        String input="(880)666111";
        String result=mobNum(input);
        System.out.println(result);
    }
}
