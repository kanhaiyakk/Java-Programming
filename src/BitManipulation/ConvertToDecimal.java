package BitManipulation;



public class ConvertToDecimal {
    public static int convert2Devimal(String str){
        int num=0,p2=1;
        int n=str.length();

        for (int i = n-1; i >=0 ; i--) {
            if (str.charAt(i)=='1'){
                num=num+p2;
            }
            p2=p2*2;
        }
        return num;
    }

    public static void main(String[] args) {
        String str="1101";
        System.out.println(convert2Devimal(str));
    }
}
