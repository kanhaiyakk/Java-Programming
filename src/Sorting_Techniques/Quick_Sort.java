package Sorting_Techniques;

public class Quick_Sort {
    public static void quickSort(int[] arr, int start,int end){
        if(start<end) {
            int pivotIndex = findPartition(arr, start, end);
            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }
    private static int findPartition(int[] arr, int start,int end){
        int pivot=arr[end];
        int i=start-1;
        for (int j = start; j <end ; j++) {
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }
    private static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void main(String[] args) {
        int[] arr={4,9,2,5,7,1,6,8,3};
        int n= arr.length;
        quickSort(arr,0,n-1);
        for (int num:arr) {
            System.out.print (num+" ");
        }
    }
}
