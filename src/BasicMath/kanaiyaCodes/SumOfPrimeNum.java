package BasicMath.kanaiyaCodes;
//To find the sum of all prime numbers from 1 to 50
public class SumOfPrimeNum {
    public static int sumOfPrime(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 50;
        System.out.println(sumOfPrime(n)); //328
    }
}
