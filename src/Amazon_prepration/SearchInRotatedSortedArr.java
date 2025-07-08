package Amazon_prepration;
//Q. Search In Rotated Sorted Array Problem Statement
//Given a rotated sorted array ARR of size 'N' and an
// integer 'K', determine the index at which 'K' is present in the array.
public class SearchInRotatedSortedArr {
    public static int findIndexOfK(int[] nums, int k){
        int low=0,high=nums.length-1;
        while (low<high){
            int mid=low+(high-low)/2;
            if (nums[mid]==k) return mid;
            if(nums[low]<nums[mid]){
                if (nums[low]<k && k<nums[mid]){
                    high=mid-1;
                }else {
                    low=mid+1;
                }
            }else {
                if (nums[mid]<k && k<nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={12, 15, 18, 2, 4};
        int k=2;
        System.out.println(findIndexOfK(arr,k));
    }
}
