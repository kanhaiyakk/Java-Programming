package Recurtion;

public class PrintNameNTimes {
    public static void printName(int i,int n){
        if(i>n) return;
        System.out.println("Kanhaiya");
        printName(i+1,n);
    }

    public static void main(String[] args) {
        int n=5;
        int i=1;
        printName(i,n);
    }
}
