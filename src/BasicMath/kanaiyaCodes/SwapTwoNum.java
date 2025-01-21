package BasicMath.kanaiyaCodes;

import java.util.Scanner;

public class SwapTwoNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = s.nextInt();
        System.out.println("Enter the value of B");
        int B = s.nextInt();
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("Value of a= " +A);
        System.out.println("Value of b= "+B);
    }
}
