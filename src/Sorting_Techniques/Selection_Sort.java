package Sorting_Techniques;

public class Selection_Sort {
    public static void selection_sort(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n-1; i++) {
            int smallest=i;
            for (int j = i+1; j < n; j++) {
                if (arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={64, 25, 12, 22, 11};
        selection_sort(arr);

        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
