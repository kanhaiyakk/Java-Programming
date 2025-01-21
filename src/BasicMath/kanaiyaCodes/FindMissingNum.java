package BasicMath.kanaiyaCodes;

public class FindMissingNum {
    public static int findMissingNum(int[] arr){
        int n= arr.length+1;
        int totalSum=n*(n+1)/2;
        int currSum=0;
        for (int i = 0; i < arr.length; i++) {
            currSum+=arr[i];
        }
        return totalSum-currSum;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        System.out.println(findMissingNum(arr));

    }
}
