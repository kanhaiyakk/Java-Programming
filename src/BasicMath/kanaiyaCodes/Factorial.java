package BasicMath.kanaiyaCodes;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number to check");
        int num=s.nextInt();
        int fact=1;
//        for(int i=1; i<=num ; i++){
//            fact=fact*i;

        for(int i = num; i >=1 ; i--) {
            fact=fact*i;
        }

        System.out.println("Factoril of num is = " + fact);
    }
}
