package Recurtion;

public class PrintNto1 {
    public static void printNto1(int i,int n){
        if (i<1) return;
        System.out.println(i);
        printNto1(i-1,n);
    }

    public static void main(String[] args) {
        int n=4;
        printNto1(n,n);
    }
}
