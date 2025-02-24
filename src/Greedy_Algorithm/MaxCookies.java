package Greedy_Algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxCookies {
    public static int maxCooliesDistributed(int[] g, int[] s){
        int n=g.length;
        int m=s.length;
        int l=0,r=0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (l<m && r<n){
            if (g[r]<=s[l]){
                r=r+1;
            }
            l=l+1;
        }
        return r;
    }

    public static void main(String[] args) {
        int g[]={1,5,3,3,4};
        int[] s={4,2,1,2,1,3};
        System.out.println(maxCooliesDistributed(g,s));
    }
}
