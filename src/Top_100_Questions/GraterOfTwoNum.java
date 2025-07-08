package Top_100_Questions;

public class GraterOfTwoNum {
    public static void graterNum(int num1,int num2){
        int max=Math.max(num1,num2);
        System.out.println(max);
//        //method2
//        if (num1==num2){
//            System.out.println("Both are equal");
//        }else {
//            int temp=num1>num2 ? num1:num2;
//            System.out.println(temp);
//        }
        //method1
//        if (num1==num2){
//            System.out.println("Both are equal");
//        } else if (num1>num2) {
//            System.out.println("Num1 is grater "+ num1);
//        }else {
//            System.out.println("Num2 is grater "+num2);
//        }
    }

    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        graterNum(num1,num2);
    }
}
