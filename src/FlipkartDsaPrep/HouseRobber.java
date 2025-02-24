package FlipkartDsaPrep;

public class HouseRobber {
public static int rob(int[] arr){
    int n= arr.length;
    if (n==0) return 0;
    if (n==1) return arr[0];
    int prev2=0;
    int prev1=arr[0];
    for (int i = 1; i <n ; i++) {
        int temp= Math.max(prev1, prev2+arr[i]);
        prev2=prev1;
        prev1=temp;
    }
    return prev1;
}

    public static void main(String[] args) {
        int[] arr={2,7,9,3,1};   //12
        System.out.println(rob(arr));
    }
}
