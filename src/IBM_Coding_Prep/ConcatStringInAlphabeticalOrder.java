package IBM_Coding_Prep;

import java.util.Arrays;

public class ConcatStringInAlphabeticalOrder {
    public static String concat(String firstString,String secondString,String thirdString){
        String[] words={firstString,secondString,thirdString};
        Arrays.sort(words);
        return String.join("",words);//Insted of String Join we can use StringBuilder
        //Using StringBuilder
//        StringBuilder sb=new StringBuilder();
//        for (String str:words){
//            sb.append(str);
//        }
//        return sb.toString();

    }

    public static void main(String[] args) {
        String firstString="one";
        String secondString="two";
        String thirdString="three";
        System.out.println(concat(firstString,secondString,thirdString));//onethreetwo
    }
}
