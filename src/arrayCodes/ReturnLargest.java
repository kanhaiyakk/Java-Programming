package arrayCodes;

import java.util.Scanner;

//Write a Java program that accepts two integer values from the user and returns the largest value.
// However if the two values are the same, return 0 and find the smallest value if the two values have
// the same remainder when divided by 6.
//Sample Output:
//
//Input the first number : 12
//Input the second number: 13
//Result: 13

public class ReturnLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a=sc.nextInt();
        System.out.println("Enter first num");
        int b= sc.nextInt();
        System.out.println("result "+ comp(a,b));
    }
   static int comp(int a , int b){

    if (a==b){
        return 0;
    }
    if (a%6 == b%6){
        return (a < b)? a : b;
    }
    return (a>b)? a:b;
}
}

