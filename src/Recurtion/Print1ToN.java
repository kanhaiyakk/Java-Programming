package Recurtion;

public class Print1ToN {
    public static void printRange(int i,int n){
        if (i>n) return;
        System.out.println(i);
        printRange(i+1,n);
    }

    public static void main(String[] args) {
        int n=10;
        printRange(1,n);
    }
}
