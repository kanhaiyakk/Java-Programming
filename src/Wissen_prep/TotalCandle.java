package Wissen_prep;

public class TotalCandle {
    public static int totalCandle(int n,int k){
        int totalCandle=n;
        int burned=n;
        while (k<=burned){
            int newCandle=burned/k;
            totalCandle=totalCandle+newCandle;
            burned=burned%k+newCandle;
        }
        return totalCandle;
    }

    public static void main(String[] args) {
        int n=15;
        int k=3;
        System.out.println(totalCandle(n,k));
    }
}
