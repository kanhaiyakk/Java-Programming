package ExceptionHandelling;

import java.util.InputMismatchException;
import java.util.Scanner;
//Write a Java program that demonstrates the use of multiple catch blocks to handle different types of exceptions.
//The program should prompt the user to enter two numbers and perform division.
// Handle scenarios where the user enters non-numeric input or attempts to divide by zero.
public class MultipleCatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter the nominator");
            int n = sc.nextInt();
            System.out.println("Enter the dominator");
            int d = sc.nextInt();
            System.out.println(n / d);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
