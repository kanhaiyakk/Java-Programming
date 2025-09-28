package BasicMath.kanaiyaCodes;

public class NinjaTeam {
    public static boolean canFormTeam(int n){
        int evenCount = 0, oddCount = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {  // i is a divisor
                // check i itself
                if (i % 2 == 0) evenCount++;
                else oddCount++;

                // check the pair divisor n/i
                if (i != n / i) {
                    if ((n / i) % 2 == 0) evenCount++;
                    else oddCount++;
                }
            }
        }

        return evenCount == oddCount;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(canFormTeam(n));
    }
}
