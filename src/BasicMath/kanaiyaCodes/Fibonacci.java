package BasicMath.kanaiyaCodes;

public class Fibonacci {
    public static void fib(int n){
        int a=0;
        int b=1;
        int next=0;
        System.out.print("fibonacci series " + a + "," + b);
        for (int i = 2; i <=n ; i++) {
            next=a+b;
            System.out.print("," + next);
            a=b;
            b=next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n=5;
        fib(n);
    }
}
