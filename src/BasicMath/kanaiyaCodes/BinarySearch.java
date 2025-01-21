package BasicMath.kanaiyaCodes;

public class BinarySearch {
    public static int findIndexOfK(int[] arr,int k){
        int low=0;
        int high= arr.length-1;
        int ans=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==k){
                ans= mid;
                high=mid-1;
            } else if (arr[mid]<k) {
                low=mid+1;

            }else {
                high=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5};
        int k=6;
        System.out.println(findIndexOfK(arr,k));
    }
}
