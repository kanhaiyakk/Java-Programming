package Top_100_Questions;

public class SumOfNNaturalNum {
    public static int sumOfNaturalNum(int n){
        //int sum=0;
        //by using recursion
        if (n==0) return n;
        return n+sumOfNaturalNum(n-1);
        //by using formula
//        sum=n*(n+1)/2;
//        return sum;

        //By for loop
//        for (int i = 1; i <= n; i++) {
//            sum+=i;
//        }
//        return sum;
    }
    public static void main(String[] args) {
        int n=6;
        System.out.println(sumOfNaturalNum(n));
    }
}
