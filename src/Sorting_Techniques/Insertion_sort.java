package Sorting_Techniques;

public class Insertion_sort {
    public static void insertionSort(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int current=arr[i];
            int j=i-1;
            while (j>=0 && current<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,7,3,9,5,6,1};
        insertionSort(arr);

        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
