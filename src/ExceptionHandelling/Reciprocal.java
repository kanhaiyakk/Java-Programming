package ExceptionHandelling;

import java.util.Scanner;
//Write a Java program that reads an integer from the user and prints its reciprocal.
//Handle the scenario where the user enters zero to avoid ArithmeticException.
public class Reciprocal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        try{
            if (n==0){
                throw new ArithmeticException("Can not find reciprocal");
            }
            double res=1.0/n;
            System.out.println(res);

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
