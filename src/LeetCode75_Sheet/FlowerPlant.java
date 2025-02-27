package LeetCode75_Sheet;

public class FlowerPlant {
    public static boolean flowerPlanted(int[] arr, int n){
        int len= arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i]==0 &&(i==0 || arr[i-1]==0) &&(i==len-1 || arr[i+1]==0)){
                arr[i]=1;
                n--;
            }
        }
        return n<=0;
    }

    public static void main(String[] args) {
        int arr[]={1,0,0,0,1};
        int n=1;
        System.out.println(flowerPlanted(arr,n));//true
        int arr1[]={1,0,0,0,1};
        int n1=2;
        System.out.println(flowerPlanted(arr1,n1));//false
    }
}
