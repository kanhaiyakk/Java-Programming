package BasicMath.kanaiyaCodes;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the num to reverse");
        int num= s.nextInt();

        int rev=0;
        int rem;

        while (num != 0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        System.out.println("Reverse of entered number is "+rev);

    }
}
