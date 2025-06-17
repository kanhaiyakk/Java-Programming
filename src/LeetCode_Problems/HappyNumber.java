package LeetCode_Problems;

import java.util.HashSet;

public class HappyNumber {
    public static boolean isHappyNum(int n){
        HashSet<Integer> seen=new HashSet<>();
        while (n!=1 && !seen.contains(n)){
            seen.add(n);
            n=squareSum(n);
        }
        return n==1;
    }
    public static int squareSum(int n){
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int n=19;
        System.out.println(isHappyNum(n));//true
        int n1=15;
        System.out.println(isHappyNum(n1));//false
    }
}
