package Top_100_Questions;

public class SumInTheRange {
    public static int calculateSum(int a,int b){
        //recursion
        if(a==0) return b;
        if (b==0) return a;
        return a+b+calculateSum(a,b-1);

//        //using formula
//        int sumA=a*(a+1)/2;
//        int sumB=b*(b+1)/2;
//        return sumB-sumA+a;


        //for loop
//        int sum=0;
//        for (int i = a; i <=b ; i++) {
//            sum+=i;
//        }
//        return sum;
    }

    public static void main(String[] args) {
        int a=5;
        int b=10;
        System.out.println(calculateSum(a,b));
    }
}
