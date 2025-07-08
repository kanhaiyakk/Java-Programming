package Top_100_Questions;

public class SumOfDigits {
    public static int sumOfDigits(int num){
        int sum=0;
        while (num!=0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num=1234;
        System.out.println(sumOfDigits(num));
    }
}
