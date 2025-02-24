package FlipkartDsaPrep;

public class CandleProblem {
    public static int totalCandle(int N, int K){
        int totalCandle=N;
        int burned=N;
        while (burned>=K){
            int newCandle=burned/K;
            totalCandle += newCandle;
            burned=burned%K +newCandle;
        }
        return totalCandle;
    }

    public static void main(String[] args) {
        int N=15;
        int K=3;
        System.out.println(totalCandle(N,K));
    }
}
