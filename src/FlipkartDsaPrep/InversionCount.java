package FlipkartDsaPrep;

public class InversionCount {
    public static int inversionCount(int[] arr){
        int invCount=0;
        int n= arr.length;
        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j <n ; j++) {
                if (arr[i]>arr[j] && i<j){
                    invCount++;
                }
            }
        }
        return invCount;
    }
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        //int arr1[] = {10,10,10,10};
        System.out.println("Inversion Count: " + inversionCount(arr)); // Output: 3
    }
}
