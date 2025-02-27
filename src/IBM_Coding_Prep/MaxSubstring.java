package IBM_Coding_Prep;

public class MaxSubstring {
    public static String maxSubstring(String str){

        //Method-2 -> Using charAt() to Compare Characters
        int maxIdx=0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i)>str.charAt(maxIdx)){
                maxIdx=i;
            }
        }
        return str.substring(maxIdx);


        //Method 1 comparing subString
//        String maxSub="";
//        for (int i = 0; i < str.length(); i++) {
//            String sub=str.substring(i);
//            if (sub.compareTo(maxSub)>0){
//                maxSub=sub;
//            }
//        }
//        return maxSub;
  }

    public static void main(String[] args) {
        String str="baca";
        System.out.println(maxSubstring(str));
    }
}
