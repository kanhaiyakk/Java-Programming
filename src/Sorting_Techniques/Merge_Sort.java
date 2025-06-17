package Sorting_Techniques;

public class Merge_Sort {
    public static void mergeSort(int[] arr, int sizeOfElement){
        if (sizeOfElement<2){
            return;
        }
        //Finding the middle and separating the left and right arr from middle
        int mid=sizeOfElement/2;
        int[] leftArr=new int[mid];
        int[] rightArr=new int[sizeOfElement-mid];
        //filling the left anf right arr
        for (int i = 0; i < mid; i++) {
            leftArr[i]=arr[i];
        }
        for (int i = mid; i <sizeOfElement ; i++) {
            rightArr[i-mid]=arr[i];
        }
        //Applying merge Sort by recursion in left arr(sorting left side)
        mergeSort(leftArr,mid);
        //Applying merge Sort by recursion in right arr(sorting right side)
        mergeSort(rightArr,(sizeOfElement-mid));
        //finally merge both left and right side sorted array
        merge(arr,leftArr,rightArr,mid,sizeOfElement-mid);
    }
    public static void merge(int[] arr,int[] leftArr, int[] rightArr, int left,int right){
        int i=0,j=0,k=0;
        //merging to sorted array concept
        while (i<left && j<right){
            if (leftArr[i]<rightArr[j]){
                arr[k++]=leftArr[i++];
            }else{
                arr[k++]=rightArr[j++];
            }
        }
        while (i<left){
            arr[k++]=leftArr[i++];
        }
        while (j<right){
            arr[k++]=rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr={10,2,5,8,9,7,3,4,11};
        int n= arr.length;
        mergeSort(arr,n);
        for (int num:arr) {
            System.out.print (num+" ");
        }
    }
}
