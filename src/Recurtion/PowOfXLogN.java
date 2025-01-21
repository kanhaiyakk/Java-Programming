package Recurtion;

public class PowOfXLogN {
    public static int calculatePow(int x,int n){
        if (n==0) return 1;
        if (x==0) return 0;
        //if n is even
        if(n%2==0){
            return calculatePow(x,n/2) * calculatePow(x,n/2);
        }
        //if n is odd
        else {
            return calculatePow(x,n/2)*calculatePow(x,n/2)* x;
        }
    }

    public static void main(String[] args) {
        int x=2,n=5;
        System.out.println(calculatePow(x,n));
    }
}
