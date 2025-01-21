package arrayCodes;

public class ReverseAnArray {
    public static void revesreArr(int[] arr){
        int left=0;
        int right= arr.length-1;
        while (left<right){
            int temp=arr[left];
            arr[left]= arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        int[] arr={1,5,3,9,7,4,6};
        revesreArr(arr);
        for (int num : arr){
            System.out.print(num+ " ");
        }
    }
}
