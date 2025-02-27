package BasicMath.kanaiyaCodes;

public class GcdOfNum {
    public static int gcd(int a,int b){
       // GCD (Iterative)
        while (b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;

        //GCD (Recursive)
//        if (b==0) return a;
//        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int a=36;
        int b=60;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));//12

        int a1=1071;
        int b1=462;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a1, b1));//21
    }
}
