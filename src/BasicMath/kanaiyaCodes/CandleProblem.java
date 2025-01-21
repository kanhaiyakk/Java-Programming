package BasicMath.kanaiyaCodes;

public class CandleProblem {
    public static int burnCandle(int M ,int N){
        int totalCandles=M;
        int leftOver=M;
        while (leftOver>=N){
            int newCandle=leftOver/N;
             totalCandles+=newCandle;
            leftOver=leftOver%N + newCandle;

        }
        return totalCandles;
    }

    public static void main(String[] args) {
        int M=15;
        int N=3;
        int result=burnCandle(15,3);
        System.out.println(result);
    }
}
