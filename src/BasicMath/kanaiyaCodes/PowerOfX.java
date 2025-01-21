package BasicMath.kanaiyaCodes;

public class PowerOfX {
    public static int myPow(int x,int n){
       if (n==0) return 1;
       if (n<0){
           x=1/x;
           n=-n;
       }
       int pow=1;
       while (n!=0){
           if (n%2==1){
               pow *=x;
           }
           x *=x;
           n=n/2;
       }
       return pow;
    }

    public static void main(String[] args) {
        int  x=2;
        int n=5;
        System.out.println(myPow(x,n));
    }
}
