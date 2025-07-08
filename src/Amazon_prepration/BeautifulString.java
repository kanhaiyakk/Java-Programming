package Amazon_prepration;
//Q. Split Binary String Problem Statement
//Chintu has a long binary string str. A binary string is a string that contains only 0 and 1.
// He considers a string to be 'beautiful' if and only if the number of 0's and 1's in the string are equal.
public class BeautifulString {
    public static int beautifulString(String str){
        int count_0=0;
        int count_1=0;
        int res=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='0'){
                count_0++;
            }else {
                count_1++;
            }
            if (count_0==count_1){
                res++;
            }
        }
        if (res==0){
            return -1;
        }else {
            return res;
        }
       // return (res == 0) ? -1 : res;
    }

    public static void main(String[] args) {
        String str="0100110101";
        System.out.println(beautifulString(str));
    }
}
