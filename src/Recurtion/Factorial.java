package Recurtion;

public class Factorial {
    public static int factorialNum(int n){
        if(n==1 || n==0){
            return 1;
        }
        int fact_nm1=factorialNum(n-1);
        int fact=n*fact_nm1;
        return fact;
    }

    public static void main(String[] args) {
        System.out.println(factorialNum(5));
    }
}
