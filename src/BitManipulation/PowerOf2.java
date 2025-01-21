package BitManipulation;

public class PowerOf2 {
    public static boolean isPowerOfTwo(int n) {
       return n>0 && (n&(n-1))==0;


//            if(n<=0) return false;
//            while(n%2==0){
//             n=n/2;
//            }
//            return n==1;
    }

    public static void main(String[] args) {
        int n=32;
        System.out.println(isPowerOfTwo(n));
    }
}
