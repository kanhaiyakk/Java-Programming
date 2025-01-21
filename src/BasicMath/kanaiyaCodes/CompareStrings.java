package BasicMath.kanaiyaCodes;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        String s1,s2;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first string");
        s1=s.nextLine();

        System.out.println("Enter the second string");
        s2=s.nextLine();

        if(s1.compareTo(s2) < 0){
            System.out.println("Fisdt string is grater");
        }
        else if (s1.compareTo(s2) > 0) {
            System.out.println("Second string is grater");
        }
        else {
            System.out.println("Both string is equal");
        }
    }
}
