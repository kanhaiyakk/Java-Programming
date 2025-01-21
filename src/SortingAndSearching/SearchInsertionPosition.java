package SortingAndSearching;
//LeetCode-35
//Given a sorted array of distinct integers and a target value, return the index if
// the target is found. If not, return the index where it would be if it were
// inserted in order.
//You must write an algorithm with O(log n) runtime complexity.
public class SearchInsertionPosition {
    public static int searchPos(int[] nums,int target){
        int left=0;
        int right=nums.length-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int[] nums={2,3,4,6,7};
        int target=6  ;
        System.out.println(searchPos(nums,target));
    }
}
