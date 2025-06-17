package BasicMath.kanaiyaCodes;

public class Primorial {
    public static Long primorial(int n){
        int count=0;
        int number=2;
        long multiply=1;
        while (count<n){
            if (isPrime(number)){
                multiply*=number;
                count++;
            }
            number++;
        }
        return multiply;
    }
    public static boolean isPrime(int n){
        if (n<=1) return false;
        if (n==2) return true;
        if (n%2==0)  return false;
        for (int i = 3; i <= Math.sqrt(n) ; i+=2) {
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(primorial(n));
    }
}
