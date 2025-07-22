package Dyanamic_Programming;

import java.util.Arrays;

public class StickCutting {
    public static int stickCutting(int N, int x,int y, int z){
        int[] dp=new int[N+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        for (int i = 1; i <=N ; i++) {
            if (i>=x && dp[i-x]!=-1){
                dp[i]=Math.max(dp[i], dp[i-x]+1);
            }
            if(i>=y && dp[i-y]!=-1){
                dp[i]=Math.max(dp[i],dp[i-y]+1 );
            }
            if(i>=z && dp[i-z]!=-1){
                dp[i]=Math.max(dp[i],dp[i-z]+1);
            }

        }
        return dp[N];
    }

    public static void main(String[] args) {
        int N = 8; // Example stick length
        int x = 1;
        int y = 4;
        int z = 6;

        int result = stickCutting(N, x, y, z);
        System.out.println(result);
    }
}
