package BitManipulation;

public class ConvertToBinary {
    public static String convert2Binary(int n){
        String str="";
        while (n!=0){
            if (n%2==1){
                str+='1';
            }else{
                str+='0';
            }
            n=n/2;
        }
        String res=new StringBuilder(str).reverse().toString();
        return res;
    }

    public static void main(String[] args) {
        int n=13;
        System.out.println(convert2Binary(n  ));
    }
}
