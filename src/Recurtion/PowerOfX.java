package Recurtion;

public class PowerOfX {
    public static int calculatePow(int x,int n){
        if (n==0) return 1;
        if (x==0) return 0;
        int xPow_nm1=calculatePow(x,n-1);
        int xPow=x*xPow_nm1;
        return xPow;
    }

    public static void main(String[] args) {
        int x=2,n=5;
        System.out.println(calculatePow(x,n));
    }
}
