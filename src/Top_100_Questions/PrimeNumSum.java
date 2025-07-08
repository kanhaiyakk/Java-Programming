package Top_100_Questions;

public class PrimeNumSum {
    public static int sumOfPrimeNum(int start, int end){
        int sum=0;
        for (int i = start; i <end ; i++) {
            if (isPrime(i)){
                sum+=i;
            }
        }
        return sum;
    }
    public static boolean isPrime(int num){
        if(num<2) return false;
        if (num==2) return true;
        if (num%2==0) return false;
        for (int i = 3; i <=Math.sqrt(num) ; i++) {
            if (num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int start=0;
        int end=50;
        System.out.println(sumOfPrimeNum(start,end));
    }
}
