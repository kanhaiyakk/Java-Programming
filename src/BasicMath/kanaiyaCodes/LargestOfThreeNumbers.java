package BasicMath.kanaiyaCodes;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of A");
        int A = s.nextInt();
        System.out.println("Enter the value of B");
        int B = s.nextInt();
        System.out.println("Enter the value of C");
        int C = s.nextInt();

        if (A>B && A>C){
            System.out.println("A is greter than B and C");
        } else if (B>A && B>C) {
            System.out.println("B is grater than A and C");
        }
        else
        {
            System.out.println("C is grater than A and B");
        }

    }
}
