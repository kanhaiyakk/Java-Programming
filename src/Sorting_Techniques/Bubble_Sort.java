package Sorting_Techniques;

public class Bubble_Sort {
    public static void bubbleSort(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={2,4,7,3,9,5,6,1};
        bubbleSort(arr);

        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
