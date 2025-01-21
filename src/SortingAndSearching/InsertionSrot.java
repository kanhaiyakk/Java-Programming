package SortingAndSearching;

public class InsertionSrot {
    public static void insertionsort(int[] arr){
        for (int i = 1; i < arr.length ; i++) {
            int curr=arr[i];
            int j=i-1;
            while (j>=0 && curr<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }

//        for (int i = 0; i <= arr.length-1; i++) {
//            int j=i;
//            while (j>0 && arr[j-1]>arr[j]){
//                int temp=arr[j-1];
//                arr[j-1]=arr[j];
//                arr[j]=temp;
//                j--;
//            }

}

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 9, 7, 4, 2, 6};
        insertionsort(arr);
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
