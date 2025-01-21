package BasicMath.kanaiyaCodes;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num=s.nextInt();

        if(num%2==0){
            System.out.println("Num is even number");

        }else{
            System.out.println("Num is odd number");
        }
    }


}
