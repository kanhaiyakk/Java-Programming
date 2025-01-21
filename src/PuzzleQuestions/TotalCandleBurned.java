package PuzzleQuestions;

public class TotalCandleBurned {
    public static int candleBurnedTotal(int N, int K){
        int total=N;
        int stubs=N;
        while (stubs>=K){
            int newCandle=stubs/K;
            total=total+newCandle;
            stubs=(stubs%K)+newCandle;

        }
        return total;

    }

    public static void main(String[] args) {
        int N=7;
        int K=4;
        System.out.println("Total number of burned candle : "+candleBurnedTotal(N,K));
    }
}
