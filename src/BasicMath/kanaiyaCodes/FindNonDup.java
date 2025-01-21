package BasicMath.kanaiyaCodes;

public class FindNonDup {
    public static int findSingleElement(int[] arr){
        int low=0;
        int high= arr.length-1;
        while (low<high){

            int mid=low+(high-low)/2;            //Write a program to find the element which is not occurring twice
                                                 // in the below sorted array where all the elements are occurring
                                         // twice except one element. Solution should be in log n[3,3,4,4,5,6,6,7,7]

            if (mid%2==1){
                mid--;

            }
            if (arr[mid]==arr[mid+1]){
                low=mid+2;
            }

                else {
                high=mid;
            }

        }
        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr={3,3,4,4,5,6,6,7,7};
        int result=findSingleElement(arr);
        System.out.println("non repeting element is: "+ result);
    }
}
