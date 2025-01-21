package BasicMath.kanaiyaCodes;

import java.util.Scanner;

public class SwapTwoNumWithThirdVeriable {
    public static void main(String[] args) {
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = s.nextInt();
        System.out.println("Enter the value of B");
        int B = s.nextInt();
        temp=A;
        A=B;
        B=temp;
        System.out.println("Value of a= " +A);
        System.out.println("Value of b= "+B);
    }
}
